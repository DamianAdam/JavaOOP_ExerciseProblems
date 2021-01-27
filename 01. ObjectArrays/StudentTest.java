public class StudentTest {
	public static void main(String[] args) {
		// 创建20个学生对象，并赋值属性。
		int num = 20;
		Student[] schoolStudent = makeStuArray(num);
		
		System.out.println("解题目一");
		// 打印出3年级的学生信息
		searchState(3, schoolStudent);
		
		System.out.println("解题目二");
		// 按照学生成绩冒泡排序
		schoolStudent = bubbleSortStudent(schoolStudent);
		// 遍历学生信息
		printArrays(schoolStudent);
	}
	
	// 创建学生对象,并自动初始化属性
	public static Student[] makeStuArray(int num) {
		Student[] schoolStudent = new Student[num];
		for (int i = 0; i < schoolStudent.length; i++) {
			schoolStudent[i] = new Student();
			schoolStudent[i].number = i + 1;
			schoolStudent[i].state = (int)(Math.random() * 3 + 1);
			schoolStudent[i].score = (int)(Math.random() * 101);
		}
		return schoolStudent;
	}
	
	// 冒泡排序学生数组
	public static Student[] bubbleSortStudent(Student[] schoolStudent) {
		for (int i = 0; i < schoolStudent.length - 1; i++) {
            for (int j = 0; j < schoolStudent.length - 1 - i; j++) {
                if (schoolStudent[j].score > schoolStudent[j + 1].score) {
                    Student temp = schoolStudent[j];
                    schoolStudent[j] = schoolStudent[j + 1];
                    schoolStudent[j + 1] = temp;
                }
            }
        }
		return schoolStudent;
	}
	
	// 查找对应年级的学生
	public static void searchState(int numState, Student[] schoolStudent) {
		System.out.println("成绩\t学号\t年级");
		for (int i = 0; i < schoolStudent.length; i++) {
			if (schoolStudent[i].state == numState) {
				System.out.println(schoolStudent[i].score + "\t" + schoolStudent[i].number + "\t" + schoolStudent[i].state);
			}
		}
		System.out.println();
	}
	
	// 遍历schoolStudent数组
	public static void printArrays(Student[] schoolStudent) {
		System.out.println("成绩\t学号\t年级");
		for (int i = 0; i < schoolStudent.length; i++) {
			System.out.println(schoolStudent[i].score + "\t" + schoolStudent[i].number + "\t" + schoolStudent[i].state);
		}
	}
}

class Student {
	int number;
	int state;
	int score;
}
