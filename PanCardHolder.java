package contructorInj;

public class PanCardHolder {

	private PanCard card;
	public PanCardHolder() {
	}
	public PanCardHolder(PanCard card) {
		this.card=card;
	}
	public void setP(PanCard card) {
		this.card=card;
	}
	
	public PanCard getP() {
		return card;
	}
}
	
	