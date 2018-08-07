package ir.kuroshfarsimadan.spring.boot.Demo8;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Kurosh Farsimadan
 * Spring bean
 *
 */
@Component
public class Tester {

	private int id = 1;
	private String tester = "Tester";
	// @Autowired for dependency injection
	// private AnotherClass cl;

	/**
	 * @param id
	 * @param tester
	 */
	public Tester(int id, String tester) {
		super();
		this.id = id;
		this.tester = tester;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tester
	 */
	public String getTester() {
		return tester;
	}

	/**
	 * @param tester
	 *            the tester to set
	 */
	public void setTester(String tester) {
		this.tester = tester;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tester [id=" + id + ", tester=" + tester + "]";
	}

}
