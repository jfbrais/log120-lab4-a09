package TP4;

public class CommandManager
{
	
	public ABSCommand createCommand(String type, final String arg0)
	{
		if (type == "moveX")
		{
			return new ABSCommand()
			{
				final int moveX = Integer.parseInt(arg0);
				@Override
				public void doIt()
				{
					new Target().setX(moveX);
				}

				@Override
				public void undoIt()
				{
					new Target().setX(moveX*-1);
				}
				
			};
		}
		else if(type == "moveY")
		{
			return new ABSCommand()
			{
				final int moveY = Integer.parseInt(arg0);
				@Override
				public void doIt()
				{
					new Target().setY(moveY);	
				}

				@Override
				public void undoIt()
				{
					new Target().setY(moveY*-1);				
				}
				
			};
		}
		else if(type == "changeZoom")
		{
			return new ABSCommand()
			{
				final int changeZoom = Integer.parseInt(arg0);
				@Override
				public void doIt()
				{
					new Target().setZoom(changeZoom*-1);				
				}

				@Override
				public void undoIt()
				{
					new Target().setZoom(changeZoom);					
				}
				
			};
		}
		else if(type == "changeImage")
		{
			return new ABSCommand()
			{
				final String undoImage = new Target().getImage();
				@Override
				public void doIt()
				{
					new Target().setImage(arg0);
				}

				@Override
				public void undoIt()
				{
					new Target().setImage(undoImage);
				}
				
			};
		}
		else
			return null;
	}
}
