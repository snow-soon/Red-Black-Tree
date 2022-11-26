// --== CS400 Fall 2022 File Header Information ==--
// Name: <Soonho Chung>
// Email: <schung75@wisc.edu>
// Team: <CT>
// TA: <Ilay>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@SuppressWarnings("unchecked")
public class RedBlackTreeTest {
	@SuppressWarnings("rawtypes")
	protected RedBlackTree _instance = null;	
	
	//BeforeEach annotation makes a method invoked automatically
	//before each test
	@BeforeEach
	public void createInstane() {
		_instance = new RedBlackTree<>();
	}
	
	/**
	 * This test method describes the case when the parent's sibling is black and new node is at
	 * opposite side of the parent node.
	 */
	@Test
	public void Case1() {
		_instance.insert(10);
		_instance.insert(5);
		_instance.insert(15);
		_instance.insert(4);
		_instance.insert(3);
		assertEquals(_instance.toLevelOrderString(),"[ 10, 4, 15, 3, 5 ]");
	}
	
	/**
	 * This test method describes the case when the parent's sibling is black and new node is at
	 * the same side of the parent node.
	 */
	@Test
	public void Case2() {
		_instance.insert(10);
		_instance.insert(8);
		_instance.insert(6);
		assertEquals(_instance.toLevelOrderString(),"[ 8, 6, 10 ]");
	}
	
	/**
	 * This test method describes the case when the parent's sibling is red
	 */
	@Test
	public void Case3() {
		_instance.insert(10);
		_instance.insert(5);
		_instance.insert(15);
		_instance.insert(4);
		_instance.insert(3);
	    assertEquals(_instance.toLevelOrderString(),"[ 10, 4, 15, 3, 5 ]");
	}

}
