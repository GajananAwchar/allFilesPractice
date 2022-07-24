package interfaceConcept;

interface Height{
int height ();
}
interface Faces{
	int noOfFaces();
}
interface lines{
	int noOfLines();
}
public interface Pyramid extends Height, Faces, lines {
	String type ();

}
