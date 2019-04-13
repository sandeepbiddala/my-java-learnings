package employee;

class Geek 
{ 
	
	String name; 
	int id; 
	
	Geek(String name, int id) 
	{ 
		
		this.name = name; 
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geek other = (Geek) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Geek [name=" + name + ", id=" + id + "]";
	} 
	
	/*@Override
	public boolean equals(Object obj) 
	{ 
		
	// if both the object references are 
	// referring to the same object. 
	if(this == obj) 
			return true; 
		
		// it checks if the argument is of the 
		// type Geek by comparing the classes 
		// of the passed argument and this object. 
		// if(!(obj instanceof Geek)) return false; ---> avoid. 
		if(obj == null || obj.getClass()!= this.getClass()) 
			return false; 
		
		// type casting of the argument. 
		Geek geek = (Geek) obj; 
		
		// comparing the state of argument with 
		// the state of 'this' Object. 
		return (geek.name.equals(this.name) && geek.id == this.id); 
	} 
	
	@Override
	public int hashCode() 
	{ 
		
		// We are returning the Geek_id 
		// as a hashcode value. 
		// we can also return some 
		// other calculated value or may 
		// be memory address of the 
		// Object on which it is invoked. 
		// it depends on how you implement 
		// hashCode() method. 
		return this.id; 
	} 
	*/
	
	

} 

