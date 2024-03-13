package collectionInj;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {

	private List<String> names;
	public void setNames(List<String> names) {
		this.names = names;
	}
	public void setIds(Set<Integer> ids) {
		this.ids = ids;
	}
	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}
	private Set<Integer> ids;
	private Map<Integer,String> details;
	public List<String> getNames() {
		return names;
	}
	public Set<Integer> getIds() {
		return ids;
	}
	public Map<Integer, String> getDetails() {
		return details;
	}
	
	
	
}
