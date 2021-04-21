/**
 * @qvthor liuwenzheng
 * @date 2021/4/21 10:12
 */
public class Demo02 {
    //public
    //protected
    //private
    //把数学私有化
    private String name;
    private int age;
    //对外提供属性的设置方法
    public void setName(String name) {
        this.name = name;
    }
    //对外提供属性的访问方法
    public String getName() {
        return  this.name ;
    }

}
