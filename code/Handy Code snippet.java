#Python3

_id, rest = log.split(" ", maxsplit=1)
print(_id,rest)
(0, rest, _id) if rest[0].isalpha() else (1, )


#Java
Print Array
System.out.print(Arrays.toString(t));

public char slowestKey(int[] releaseTimes, String keysPressed) {
  int maxReleaseTime = 0;
  int maxReleaseTimeIdx = 0;
  for (int idx = 0; idx < releaseTimes.length; idx++) {
    int currentIdx = keysPressed.charAt(idx) - 'a';
    int currReleaseTime = releaseTimes[idx] - (idx == 0 ? 0 : releaseTimes[idx - 1]);
    if (currReleaseTime >= maxReleaseTime) {
      if (currReleaseTime > maxReleaseTime)  {
        maxReleaseTimeIdx = currentIdx;
          
      } 
        else
            // this if solved the equivalent relase time, but return 
            // lexical bigger letter 
            // cause currentIdx is calcaulted by -'a'
            if (currentIdx > maxReleaseTimeIdx) {
        maxReleaseTimeIdx = currentIdx;
      }
      maxReleaseTime = currReleaseTime;
    }
  }
  return (char) (97 + maxReleaseTimeIdx);
}

IntStream.of(a).anyMatch(x -> x == 4);

Map.Entry<Integer,Integer> entry: map.entrySet()
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==n){
                return entry.getKey();
            }
        }
{p=1, q=1, r=1, t=1, e=1, u=1, w=1, y=1, i=1, o=1}
update(map, "qwertyuiop", 1);
System.out.println(map);

String[] values = {"AB","BC","CD","AE"};
boolean contains = Arrays.stream(values).anyMatch("s"::equals);
System.out.println(map.values());
map.keySet()
System.out.println(Arrays.asList(arr));

TreeSet<Integer> set = new TreeSet<>();
for (int num : arr2) {
  set.add(num);
}
System.out.print(set);
[10,9,1,8]

stdout
[1, 8, 9, 10]

Integer higher = set.ceiling(num);
Integer lower = set.floor(num);

The ceiling() method of java.util.TreeSet<E> class is used to return the least element in this set greater than or equal to the given element, or null if there is no such element.

Syntax:

public E ceiling(E e)
Parameters: This method takes the value e as a parameter which is to be matched.

Return Value: This method returns the least element greater than or equal to e, or null if there is no such element.
The floor() method of java.util.TreeSet<E> class is used to return the greatest element in this set less than or equal to the given element, or null if there is no such element.

Syntax:

public E floor(E e)
Parameters: This method takes the value e as a parameter which is to be matched.

Return Value: This method returns the greatest element less than or equal to e, or null if there is no such element


list.clear();
list.add(Arrays.asList(arr[i], arr[i + 1]));
Arrays.stream(arr).forEach(e->System.out.print(e + " ")); 
  max=Math.max((double)(Arrays.stream(subArray)
    .sum())/(double)k,(double)max);

System.out.println(rowMap);
System.out.println(colMap);
{0=1, 1=1}
{1=2}

// do not print array, will be object

return (double)(double)(sum)/(double)(salary.length-2);

PriorityQueue<Integer> src = new PriorityQueue<>();
PriorityQueue<Integer> dest = new PriorityQueue<>();
rc.offer(target[i]);

List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());
asList have issue
int min =Collections.min(list); 
finally can be used on leetcode

Arrays.fill(rowMin, Integer.MAX_VALUE);
Adding Elements: In order to add an element in a priority queue, we can use the add() method. The insertion order is not retained in the PriorityQueue. The elements are stored based on the priority order which is ascending by default.

public class PriorityQueueDemo { 
  
    public static void main(String args[]) 
    { 
        PriorityQueue<String> pq = new PriorityQueue<>(); 
  
        pq.add("Geeks"); 
        pq.add("For"); 
        pq.add("Geeks"); 
  
        System.out.println(pq); 
    } 
}
Output:

[For, Geeks, Geeks]


int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

Integer.MAX_VALUE
Integer.MIN_VALUE
-2147483648


for (int j = 0; j<4; ++j)
    System.out.println(j);
for (int j = 0; j<4; j++)
    System.out.println(j);

0
1
2
3
0
1
2
3

char[] binValues = Integer.toBinaryString(N).toCharArray();
Integer.parseInt(sb.toString(),2);
// get negate of bitwise
sb.append(Character.getNumericValue(c)^1);

System.out.println(binValues);

System.out.println(Character.getNumericValue('A'));
System.out.println(Character.getNumericValue('a'));
10 and 10
System.out.println((int)('a'));
65
System.out.println((int)('A')); 
97
abs 32
str.length();
// get String from Character c
String.valueOf(c)
Character.isLetterOrDigit(s.charAt(start))
List<String> words = new ArrayList<>();
System.out.println(words);
// Array would be printed out as object
String space = String.join("", Collections.nCopies(batchSize, " ")); 
// external library  
StringUtils.repeat(" ", n-1)     

## Bitwisse
Bitwise XOR (^) –
This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR of input values, i.e, if corresponding bits are different, it gives 1, else it gives 0.

public int[][] flipAndInvertImage(int[][] A) {
    int numOfrow=A.length;
    for(int[] row:A){
        swap(row);
    }

int[] subArr = IntStream.range(startInclusive, endExclusive)
                        .map(i -> src[i])
                        .toArray();

##String
Character.isLowerCase(char ch) 
s. charAt(0) 
for (char ch: "xyz".toCharArray()) {
}

Character.getNumericValue(a.charAt(idxA--))
str.length()
Set<String> set = new HashSet<>();
s.replace(".", "");
s.substring(0, idx);
Character.isUpperCase(char ch) 
Character.isDigit(char ch) 
Character.isWhitespace(c);
//split by space and commad
"[\\s,]+"
String[] splited = str.split("\\s+");
s.trim()
String s
s.endsWith("AM")
return num < 0 ? "-" + sb.reverse().toString() : sb.reverse().toString();
result.add(new String(chars));
// trims the trailing and leading spaces 

Map<Character, Integer> map = new HashMap<>();

Java 8
put method inserts the element ( key value pair ) into the Map. If the Map already contains an element with the same Key, the value is overwritten with the new element value.

putIfAbsent performs the check to see if the same Key already existed in the Map and will only all a new element if it's not already there ( Match by the Key )

## Array

int[] arr = { 10, 20, 30 };
int newarr[] = new int[n + 1]; 
int[] nums=IntStream.rangeClosed(left, right).toArray();
// Imports
import com.google.common.collect.Range;
 
// A range that contains all values greater than or equal to 2
// and less than or equal to 4

String[] itemsArray = new String[itemList.size()];
itemsArray = itemList.toArray(itemsArray);

Collections.addAll(list, values);


int[] ascii = new int[26];
public int diagonalSum(int[][] mat) {
int sum = 0;
// Left -> Right Diagonal
for (int i = 0; i < mat.length; i++) {
  sum += mat[i][i];
}
// Right -> Left Diagonal
int rowIdx = 0;
int colIdx = mat[0].length - 1;
while (rowIdx < mat.length) {
  // Check to remove intersecting element in both diagonals
  if (rowIdx != colIdx) {
    sum += mat[rowIdx][colIdx];
  }
  rowIdx++;
  colIdx--;
}
return sum;        
}


appendMap.put(i, appendMap.get(i) - 1);
copy map
Map<Character, Integer> copyMap = new HashMap<>(licenseMap);
(copyMap.size()

