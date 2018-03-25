import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class QuickEntryMediator {
    private JTextField textField;
    private JList list;
    public QuickEntryMediator(JTextField t,JList l){
        textField=t;
        list=l;
        textField.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        textFieldChanged();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        textFieldChanged();
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        textFieldChanged();
                    }
                }
        );
    }

    private void textFieldChanged() {
        String prefix=textField.getText();
        if(prefix.length()==0){
            list.clearSelection();
            return;
        }
        ListModel m=list.getModel();
        boolean found=false;
        for(int i=0;!found&&i<m.getSize();i++){
            Object o=m.getElementAt(i);
            String s=o.toString();
            if (s.startsWith(prefix)){
                list.setSelectedValue(o,true);
                found=true;
            }
        }
        if(!found){
            list.clearSelection();
        }
    }
    public static void main(String[] args){
        JTextField textField=new JTextField();
        JList list=new JList();
        QuickEntryMediator mediator=new QuickEntryMediator(textField,list);

    }
}
