/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTable;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Vageesha
 */
public class JTableUtilities {
    
    public static void setCellsAlignment(JTable table, int alignment,int column)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);

    }
}
