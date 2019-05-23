class StatementTest {

	@Test
	void testStatement() {

    Customer CostumerTest = new Customer("Matheus Mendes");

		Movie m1 = new Movie("Fight Club", 0);
		Movie m2 = new Movie("Aladdin", 2);
		Movie m3 = new Movie("Interestellar", 1);
    Movie m4 = new Movie("Avengers",1);

		Rental r1 = new Rental(m1, 4);
		Rental r2 = new Rental(m2, 2);
		Rental r3 = new Rental (m3, 5);
    Rental r4 = new Rental (m4, 10);


		CostumerTest.addRental(r1);
		CostumerTest.addRental(r2);
		CostumerTest.addRental(r3);
    CostumerTest.addRental(r4);

		String expectedStatement="Rental Record for Matheus Mendes\n"
				+"\tFight Club\t3.0\n"
				+"\tAladdin\t1.5\n"
				+"\tInterestellar\t15.0\n"
        +"\tAvengers\t30.0\n"
				+"Amount owed is 49.5\n"
				+"You earned 5 frequent renter points";


		assertEquals(CostumerTest.statement(), expectedStatement);

	}

}
