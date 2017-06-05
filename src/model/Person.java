package model;

import java.util.Map;
import java.util.Set;

/**
 * @author jiayin.wang
 *
 */
public abstract class Person {

	private String name;
	private Integer age;
	private Double height;
	private String[] favorite;
	private Set<String> address;
	private Map<String, String> others;

	/**
	 *
	 */
	public abstract void outputName();

	/**
	 *
	 */
	public abstract void outputAge();

	/**
	 *
	 */
	public abstract void outputHeight();

	/**
	 *
	 */
	public abstract void outputFavorite();

	/**
	 *
	 */
	public abstract void outputAddress();

	/**
	 *
	 */
	public abstract void outputOthers();

	/**
	 *
	 */
	public Person() {

	}

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param favorite
	 * @param address
	 * @param others
	 */
	public Person(final String name, final Integer age, final Double height, final String[] favorite,
			final Set<String> address, final Map<String, String> others) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.favorite = favorite;
		this.address = address;
		this.others = others;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(final Integer age) {
		this.age = age;
	}

	/**
	 * @return
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height
	 */
	public void setHeight(final Double height) {
		this.height = height;
	}

	/**
	 * @return
	 */
	public String[] getFavorite() {
		return favorite;
	}

	/**
	 * @param favorite
	 */
	public void setFavorite(final String[] favorite) {
		this.favorite = favorite;
	}

	/**
	 * @return
	 */
	public Set<String> getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(final Set<String> address) {
		this.address = address;
	}

	/**
	 * @return
	 */
	public Map<String, String> getOthers() {
		return others;
	}

	/**
	 * @param others
	 */
	public void setOthers(final Map<String, String> others) {
		this.others = others;
	}
}
