package calcul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pushswap {

    private List<Integer> stackA;
    private List<Integer> stackB;
    
    public Pushswap(List<Integer> input) {
        stackA = new ArrayList<>(input);
        stackB = new ArrayList<>();
    }
    
    
    
    public List<Integer> getStackA() {
		return stackA;
	}



	public void setStackA(List<Integer> stackA) {
		this.stackA = stackA;
	}



	public List<Integer> getStackB() {
		return stackB;
	}



	public void setStackB(List<Integer> stackB) {
		this.stackB = stackB;
	}

    
    public void pa() {
        if (!stackB.isEmpty()) {
            stackA.add(0, stackB.get(0));
            stackB.remove(0);
        }
    }
    
    public void pb() {
        if (!stackA.isEmpty()) {
            stackB.add(0, stackA.get(0));
            stackA.remove(0);
        }
    }
    
    public void sa() {
        if (stackA.size() > 1) {
            Collections.swap(stackA, 0, 1);
        }
    }
    
    public void sb() {
        if (stackB.size() > 1) {
            Collections.swap(stackB, 0, 1);
        }
    }
    
    public void ra() {
        if (!stackA.isEmpty()) {
            int last = stackA.get(stackA.size() - 1);
            stackA.remove(stackA.size() - 1);
            stackA.add(0, last);
        }
    }
    
    public void rb() {
        if (!stackB.isEmpty()) {
            int last = stackB.get(stackB.size() - 1);
            stackB.remove(stackB.size() - 1);
            stackB.add(0, last);
        }
    }
    
    public void rra() {
        if (!stackA.isEmpty()) {
            int first = stackA.get(0);
            stackA.remove(0);
            stackA.add(first);
        }
    }
    
    public void rrb() {
        if (!stackB.isEmpty()) {
            int first = stackB.get(0);
            stackB.remove(0);
            stackB.add(first);
        }
    }
}
