import java.util.ArrayList;
import java.util.List;

/**
 * Holds data for particular instance. Integer values refer to offsets in meta-data arrays of a
 * surrounding DataSet.
 */
public class Instance {
  /* label: contains the label of this instance */
  public String label;
  /* attributes: contains the attribute "values" of this instance */
  /* The name of the attributes are only in the DataSet class */
  public List<String> attributes = null;

  /**
   * Add attribute values in the order of attributes as specified by the dataset
   */
  public void addAttribute(String i) {
    if (attributes == null) {
      attributes = new ArrayList<String>();
    }
    attributes.add(i);
  }
}
