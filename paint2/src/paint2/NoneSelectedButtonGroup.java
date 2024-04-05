package paint2;

import paint2.*;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class NoneSelectedButtonGroup extends ButtonGroup 
{

  @Override
  public void setSelected(ButtonModel model, boolean selected) 
  {

    if (selected) 
    {
      super.setSelected(model, selected);
    } 
    else 
    {
      clearSelection();
    }
  }
  
}
