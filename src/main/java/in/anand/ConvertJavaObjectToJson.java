package in.anand;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaObjectToJson {
	public static void main(String[] args) throws JsonProcessingException
	{
		Book book = new Book();
		book.setBookId(101);
		book.setBookName("spring");
		book.setBookprice(7800.89);
		
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(json);
	}

}
