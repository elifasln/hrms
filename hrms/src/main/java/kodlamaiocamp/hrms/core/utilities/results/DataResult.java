package kodlamaiocamp.hrms.core.utilities.results;

public class DataResult<T> extends Result{
	//data ürün,kategori gibi birden fazla data olabilir
	//bu yüzden generic bir yapı oluşturuyoruz
	

	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);  //super base sınıfın(Result) constractor larını çalıştırıyor
		this.data=data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);  //super base sınıfın(Result) constractor larını çalıştırıyor
		this.data=data;
	}
	public T getData() {
		return this.data;
		
		//data yı döndürdük
	}
	

}
