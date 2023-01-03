package lab10.builder;

import java.util.ArrayList;

public class House {
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isTermalOption() {
		return termalOption;
	}

	public void setTermalOption(boolean termalOption) {
		this.termalOption = termalOption;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", floors=" + floors +
				", termalOption=" + termalOption +
				", rooms=" + rooms +
				", security=" + security +
				", pool=" + pool +
				'}';
	}

	private String location;
	private int floors;
	private boolean termalOption;
	private int rooms;
	private boolean security;
	private boolean pool;
	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.termalOption = builder.termalOption;
		this.rooms = builder.rooms;
		this.security = builder.security;
		this.pool = builder.pool;
	}

	// TODO: generate getters


	// TODO: override toString method


	public static class HouseBuilder {

		private String location;
		private int floors;
		private boolean termalOption;
		private int rooms;
		private boolean security;
		private boolean pool;

		public HouseBuilder(String location, int floors, boolean termalOption, int rooms) {
			this.location = location;
			this.floors = floors;
			this.termalOption = termalOption;
			this.rooms = rooms;
		}

		public HouseBuilder security(boolean security) {
			this.security = security;
			return this;
		}
		public HouseBuilder pool(boolean pool) {
			this.pool = pool;
			return this;
		}
		public House build() {
			return new House(this);
		}

		// TODO: test functionality in a Main class
	}
}
