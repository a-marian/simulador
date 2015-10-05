package simulador.forms;

public class CaraForm {
	
	protected String oclusal;
	protected String vestibular;
	protected String lingual;
	protected String distal;
	protected String tambores;
	
	
	public String getOclusal() {
		return oclusal;
	}
	public void setOclusal(String oclusal) {
		this.oclusal = oclusal;
	}
	public String getVestibular() {
		return vestibular;
	}
	public void setVestibular(String vestibular) {
		this.vestibular = vestibular;
	}
	public String getLingual() {
		return lingual;
	}
	public void setLingual(String lingual) {
		this.lingual = lingual;
	}
	public String getDistal() {
		return distal;
	}
	public void setDistal(String distal) {
		this.distal = distal;
	}
	public String getTambores() {
		return tambores;
	}
	public void setTambores(String tambores) {
		this.tambores = tambores;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ( oclusal +" "+ vestibular+ " " + distal+ " "+ lingual+" "+ tambores);
	}
	
	
	

}
