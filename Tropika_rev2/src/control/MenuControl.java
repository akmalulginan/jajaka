package control;

import java.awt.Component;
import javax.swing.JTabbedPane;

public class MenuControl {
    

    public void newTab(Component cmpnt, JTabbedPane pane) {
        int nTab;
        Boolean stat = false;
        nTab = pane.getTabCount();
        
        if (nTab == 0) {
            String title = cmpnt.getName();
            pane.add(title, cmpnt);

            pane.setTabComponentAt(nTab, new ButtonTabComponent(pane));

            pane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
            pane.setSelectedIndex(nTab);
        } else {
            for (int i = 0; i < nTab; i++) {
                if (pane.getComponentAt(i).getName() == cmpnt.getName()) {
//                    JOptionPane.showMessageDialog(null, "sudah ada");
                    stat = false;

                    pane.setSelectedIndex(i);
                    i = nTab;
                } else {
//                    JOptionPane.showMessageDialog(null, "belum");
                    stat = true;
                }
            }
        }

        if (stat == true) {
            String title = cmpnt.getName();
            pane.add(title, cmpnt);

            pane.setTabComponentAt(nTab, new ButtonTabComponent(pane));

            pane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
            pane.setSelectedIndex(nTab);
        }
    }

}
