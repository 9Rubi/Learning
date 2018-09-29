package composite;

/**
 *
 *
 * @author : Rubi
 * @version : 2018-09-26 22:21 下午
 */
public interface Component {
    void operation();
}
interface Leaf extends Component{

}
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
