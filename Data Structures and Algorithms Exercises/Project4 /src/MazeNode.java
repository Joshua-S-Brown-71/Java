import java.util.*;
import java.io.*;

public class MazeNode 
{
		int value;
		int lr;
		int lc;
		boolean left;
		boolean down;
		
		public MazeNode(int inValue,int inLr, int inLc)
		{
			value=inValue;
			lr=inLr;
			lc=inLc;

			left=true;
			down=true;

		}
}



