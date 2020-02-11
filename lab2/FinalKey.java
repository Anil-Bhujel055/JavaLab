class FinalKey
{
	// final must be static to be used inside static method
	static final int num1 = 5;

	final char letter;

// it can be initialized into a constructor
				FinalKey()
				{
					letter = 'A';
				}

		public static void main(String[] args) {
			FinalKey obj = new FinalKey();

			System.out.println(num1);
			System.out.println(obj.letter);
		}
}