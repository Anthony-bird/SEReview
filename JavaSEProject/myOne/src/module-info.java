import com.feng.demo03.MyService;
import com.feng.demo03.impl.Book;
import com.feng.demo03.impl.Money;

module myOne{
    exports com.feng.demo01;
    exports com.feng.demo03;

//    provides MyService with Money;
    provides MyService with Book;
}