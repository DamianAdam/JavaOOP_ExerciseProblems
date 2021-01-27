public class StudentTest {
	public static void main(String[] args) {
		// 创建20个学生对象，并赋值属性。
		Student[] schoolStudent = new Student[20];
		for (int i = 0; i < schoolStudent.length; i++) {
			schoolStudent[i] = new Student();
			schoolStudent[i].number = i + 1;
			schoolStudent[i].state = (int)(Math.random() * 3 + 1);
			schoolStudent[i].score = (int)(Math.random() * 101);
		}
		// 打印出3年级的学生信息
		System.out.println("解题目一");
		System.out.println("成绩\t学号\t年级");
		for (int i = 0; i < schoolStudent.length; i++) {
			if (schoolStudent[i].state == 3) {
				System.out.println(schoolStudent[i].score + "\t" + schoolStudent[i].number + "\t" + schoolStudent[i].state);
			}
		}
		System.out.println();
		
		// 按照学生成绩冒泡排序
		System.out.println("解题目二");
        for (int i = 0; i < schoolStudent.length - 1; i++) {
            for (int j = 0; j < schoolStudent.length - 1 - i; j++) {
                if (schoolStudent[j].score > schoolStudent[j + 1].score) {
                    Student temp = schoolStudent[j];
                    schoolStudent[j] = schoolStudent[j + 1];
                    schoolStudent[j + 1] = temp;
                }
            }
        }
		// 遍历学生信息
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