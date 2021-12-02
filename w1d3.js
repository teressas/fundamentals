class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

class SLL {
    constructor() {
            this.head = null;
        }

    // ------------------------------------- Week 1 Day 3 algo -------------------------------------------
    
    insertAtFront(val){
        // construct a node with the val
        // make the new node as the front (HINT: What is the front of a Singly Linked List)
    }


    removeHead(){
        // Remove the head (HINT: What will be the new head?)

    }

    //*** bonus question ***
    average(){
        // Find the average of all the nodes inside a Singly Linked List
        // HINT: How to get an average? What information do we need to generate an average?
        // BONUS: What if one of the nodes stored String instead of int? How do you want to handle that edge case?
    }
    // ------------------------------------- END OF Week 1 Day 3 algo -------------------------------------------



    // If you want to use the following methods, please fill in the logic on your own. (You can copy from Discord if you want to)
    // ------------------------------------- Week 1 Day 2 algo -------------------------------------------
    isEmpty(){} //empty method holder

    insertAtBack(val){} //empty method holder

    arrToList(arr){} //empty method holder

    printList(){
        if(!this.head){
            console.log("Empty list");
            return
        }
        var runner = this.head;
        while(runner){ // while(runner != null)
            console.log(runner.val);
            runner = runner.next;            
        }
    }

    // ------------------------------------- END OF Week 1 Day 2 algo -------------------------------------------


}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 
var list1 = new SLL();
list1.head = a;
list1.printList();
// list1: (1) --> (2) --> (3) --> null


// SOLUTIONS

class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

class SLL {
    constructor() {
            this.head = null;
        }

    // ------------------------------------- Week 1 Day 3 algo -------------------------------------------
    
    insertAtFront(val){
        var newNode = new Node(val);
        // construct a node with the val
        // make the new node as the front (HINT: What is the front of a Singly Linked List)
        if (!this.head){
          this.head = newNode;
        } else {
            newNode.next = this.head;
            // var temp = this.head;
            this.head = newNode;
            // this.head.next = temp; 
            // console.log(newNode)
        }
      }
      // head
      // (1) --> (2) --> (3) --> null

      // line16: newNode(100)
      //line 22: 
      //                  head
      // newNode(100) --> (1) --> (2) --> (3) --> null

      //line 24: 
      // head
      // newNode(100) --> (1) --> (2) --> (3) --> null









    removeHead(){
        // Remove the head (HINT: What will be the new head?)
        var temp = this.head.next;
        this.head = temp;
      
    }

    //*** bonus question ***
    average(){
        // Find the average of all the nodes inside a Singly Linked List
        // HINT: How to get an average? What information do we need to generate an average?
        // BONUS: What if one of the nodes stored String instead of int? How do you want to handle that edge case?

        var runner = this.head;
        // Loop until runner.next = null
        var count = 1;
        var total = runner.val;
        while (runner.next) {   
          // if (typeof())
          runner = runner.next;
          total += runner.val;
          count++;
          console.log("Count: " + count);
          console.log("Total: " + total);
        }
        var average = total / count;
        return average;
    }
    // ------------------------------------- END OF Week 1 Day 3 algo -------------------------------------------



    // If you want to use the following methods, please fill in the logic on your own. (You can copy from Discord if you want to)
    // ------------------------------------- Week 1 Day 2 algo -------------------------------------------
    isEmpty(){
      
    } //empty method holder

    insertAtBack(val){} //empty method holder

    arrToList(arr){} //empty method holder

    printList(){
        if(!this.head){
            console.log("Empty list");
            return
        }
        var runner = this.head;
        while(runner){ // while(runner != null)
            console.log(runner.val);
            runner = runner.next;            
        }
    }

    // ------------------------------------- END OF Week 1 Day 2 algo -------------------------------------------


}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 
var list1 = new SLL();
list1.head = a;
// list1.printList();
// list1: (1) --> (2) --> (3) --> null

console.log("Insert At Front");
list1.insertAtFront(7);
list1.printList();

// console.log("Remove Head");
// list1.removeHead();
// list1.printList();

// console.log("Average");
// list1.average();