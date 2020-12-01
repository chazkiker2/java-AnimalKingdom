package lectureworkspace.arrays;

public class MultiDimensionalArr
{
	private static void twoDim()
	{

		int[][] a = {{1, 2, 3}, {4, 5, 6, 9}, {7},};
		System.out.println("\n**** TWO DIMENSIONAL ARRAY EXAMPLE ****");
		System.out.println("int[][] a = {{1,2,3}, {4,5,6,9}, {7}}");
		System.out.println("\n*** Nested for loop, watch this shit ***");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Length of row " + i + ": " + a[i].length);
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.println("i=" + i + ", j=" + j + " -- el=" + a[i][j]);
			}
		}

		System.out.println("\n*** Nested for loop –– print each element ***");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}

		System.out.println("\n*** For each loop ***");
		for (int[] innerArr: a)
		{
			for (int data: innerArr)
			{
				System.out.println(data);
			}
		}

	}

	private static void threeDim()
	{
		int[][][] arr = {
				{
						{1, -2, 3},
						{2, 3, 4}
				},
				{
						{-4, -5, 6, 9},
						{1},
						{2, 3}
				}
		};

		System.out.println("\n\n**** THREE DIMENSIONAL ARRAY EXAMPLE ****");
		System.out.println("int[][][] arr = { \n{ {1, -2, 3}, {2, 3, 4} }, \n{ {-4, -5, 6, 9}, {1}, {2, 3} } \n}");

		// for..each loop to iterate through elements of a 3D array
		System.out.println("\nfor..each loop to iterate through elements of a 3D array");
		for(int[][] arr2D: arr) {
			for (int[] arr1D: arr2D) {
				for (int el: arr1D) {
					System.out.println(el);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		twoDim();
		threeDim();
	}
}
