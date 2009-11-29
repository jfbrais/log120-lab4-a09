package TP4;

public class CommandManager
{
	public ABSCommand createCommand(String type)
	{
		if (type == "moveX")
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
		else if(type == "moveY")
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
