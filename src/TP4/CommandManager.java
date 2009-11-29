package TP4;

public class CommandManager
{
	public ABSCommand createCommand(String type, final String arg0)
	{
		if (type == "moveX")
		{
			return new ABSCommand()
			{
				@Override
				public void doIt()
				{
					new Target().setX(Integer.parseInt(arg0));
				}

				@Override
				public void undoIt()
				{
					new Target().setX(Integer.parseInt(arg0)*-1);
				}
				
			};
		}
		else if(type == "moveY")
		{
			return new ABSCommand()
			{
				@Override
				public void doIt()
				{
					new Target().setY(Integer.parseInt(arg0));	
				}

				@Override
				public void undoIt()
				{
					new Target().setY(Integer.parseInt(arg0)*-1);				
				}
				
			};
		}
		else if(type == "changeZoom")
		{
			return new ABSCommand()
			{
				@Override
				public void doIt()
				{
					// TODO Auto-generated method stub					
				}

				@Override
				public void undoIt()
				{
					// TODO Auto-generated method stub					
				}
				
			};
		}
		else if(type == "changeImage")
		{
			return new ABSCommand()
			{
				@Override
				public void doIt()
				{
					// TODO Auto-generated method stub					
				}

				@Override
				public void undoIt()
				{
					// TODO Auto-generated method stub
				}
				
			};
		}
		else
			return null;
	}
	
	public void undoCommand()
	{
		
	}
}
