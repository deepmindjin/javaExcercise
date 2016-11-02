import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.METHOD)			//CONSTRUCTOR, LOCAL VARIABLE, METHOD, PACAKAGE, PARAMETER, TYPE(CLASS) 
@Retention(RetentionPolicy.RUNTIME)	//애너테이션에 세팅된 정보를 유지하는 단계 : 소스코드, 클래스, 런타임
public @interface Annotation {
	String author();
	String date();
	String version() default "1.0";
}
