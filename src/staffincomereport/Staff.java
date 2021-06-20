package staffincomereport;


public class Staff {
		
		private String name;
		private String id;
		private Income income;
		
		Staff (String name, String id, Income income) {
			this.name = name;
			this.id = id;
			this.income = income;
		}

		public Staff() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Income getIncome() {
			return income;
		}

		public void setIncome(Income income) {
			this.income = income;
		}
		

		void show() {
			// TODO Auto-generated method stub
			System.out.println("Nama : " + this.name + "Id :" + this.id);
		}
}
