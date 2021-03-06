
@Annotation(author = "장홍석", date = "10/27/2016")
public class AnnoMain {

	public static void main(String[] args) {
		AnnoMain main = new AnnoMain();
		
		Class<?> klass = main.getClass();
		Annotation anno = klass.getAnnotation(Annotation.class);
		StringBuffer result = new StringBuffer();
		if(anno != null){
			result.append("작성자 : "+anno.author()+"\n");
			result.append("작성일 : "+anno.date()+"\n");
			result.append("버전 : "+anno.version()+"\n");
		}
		main.print(result.toString());
	}
	
	
	public void print(String result){
		System.out.println(result);
	}

}
