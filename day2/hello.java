import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class hello {
	public boolean verify(String input) {
		String[] array = input.split(" ");

		if (input.isEmpty()) {
			break;
		}

		for (int i = 0; i < array.length; i++) {
			numbers.add(Integer.parseInt(array[i]));
		}

		for (int i = 0; i < numbers.size() - 1; i++) {
			if (i == 0) {
				if (numbers.get(i) < numbers.get(i + 1)) {
					increasing = true;
				} else if (numbers.get(i) > numbers.get(i + 1)) {
					increasing = false;
				} else {
					found = false;
					break;
				}
			} else {
				if (numbers.get(i) < numbers.get(i + 1)) {
					if (!increasing) {
						found = false;
						break;
					}
				} else if (numbers.get(i) > numbers.get(i + 1)) {
					if (increasing) {
						found = false;
						break;
					}
				} else {
					found = false;
					break;
				}
			}
		}

		if (found == false) {
			continue;
		} else {
			boolean valid = true;
			for (int i = 0; i < numbers.size() - 1; i++) {
				if (Math.abs(numbers.get(i) - numbers.get(i + 1)) < 1
						|| Math.abs(numbers.get(i) - numbers.get(i + 1)) > 3) {
					valid = false;
					break;
				}
			}
			if (valid == true) {
				counter++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		while (true) {
			boolean found = true;
			boolean increasing = true;
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			String input = scan.nextLine();
			String[] array = input.split(" ");

			if (input.isEmpty()) {
				break;
			}

			for (int i = 0; i < array.length; i++) {
				numbers.add(Integer.parseInt(array[i]));
			}

			for (int i = 0; i < numbers.size() - 1; i++) {
				if (i == 0) {
					if (numbers.get(i) < numbers.get(i + 1)) {
						increasing = true;
					} else if (numbers.get(i) > numbers.get(i + 1)) {
						increasing = false;
					} else {
						found = false;
						break;
					}
				} else {
					if (numbers.get(i) < numbers.get(i + 1)) {
						if (!increasing) {
							found = false;
							break;
						}
					} else if (numbers.get(i) > numbers.get(i + 1)) {
						if (increasing) {
							found = false;
							break;
						}
					} else {
						found = false;
						break;
					}
				}
			}

			if (found == false) {
				continue;
			} else {
				boolean valid = true;
				for (int i = 0; i < numbers.size() - 1; i++) {
					if (Math.abs(numbers.get(i) - numbers.get(i + 1)) < 1
							|| Math.abs(numbers.get(i) - numbers.get(i + 1)) > 3) {
						valid = false;
						break;
					}
				}
				if (valid == true) {
					counter++;
				}
			}

		}
		System.out.print(counter);
		scan.close();
	}
}
