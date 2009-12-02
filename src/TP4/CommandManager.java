package TP4;

public class CommandManager
{
	public ABSCommand createCommand(String type, final String arg0)
	{
		try
		{
			if(type == "changeZoom")
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
		catch (Exception e) 
		{
			return null;
		}
	}
	
	public ABSCommand createCommand(String type, final String arg0, final String arg1)
	{
		try
		{
			if (type == "move")
			{
				return new ABSCommand()
				{
					final int moveX = Integer.parseInt(arg0);
					final int moveY = Integer.parseInt(arg1);
					@Override
					public void doIt()
					{
						new Target().setX(moveX);
						new Target().setY(moveY);
					}
	
					@Override
					public void undoIt()
					{
						new Target().setX(moveX*-1);
						new Target().setY(moveY*-1);
					}
					
				};
			}
			else
				return null;
		}
		catch (Exception e) 
		{
			return null;
		}		
	}
	
	public ABSCommand createCommand(final String arg0, final String arg1, final String arg2, final String arg3)
	{
		try
		{
			return new ABSCommand()
			{
				final int moveX = Integer.parseInt(arg0) - new Target().getX();
				final int moveY = Integer.parseInt(arg1) - new Target().getY();
				final int changeZoom = new Target().getZoom() - Integer.parseInt(arg2);
				final String image = arg3;
				final String undoImage = new Target().getImage();
				
				@Override
				public void doIt()
				{
					new Target().setX(moveX);
					new Target().setY(moveY);
					new Target().setZoom(changeZoom*-1);
					new Target().setImage(image);
				}
	
				@Override
				public void undoIt()
				{
					new Target().setX(moveX);
					new Target().setY(moveY);
					new Target().setZoom(changeZoom);	
					new Target().setImage(undoImage);
				}
				
			};
		}
		catch (Exception e)
		{
			return null;
		}
	}
}
