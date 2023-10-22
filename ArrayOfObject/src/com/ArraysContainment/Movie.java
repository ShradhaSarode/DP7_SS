package com.ArraysContainment;

public class Movie
{
	private int mId;
	private String mName;
	private double rating;
	public Movie()
	{
		super();
	}
	public Movie(int mId, String mName, double rating)
	{
		super();
		this.mId = mId;
		this.mName = mName;
		this.rating = rating;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() 
	{
		return "Movie [mId=" + mId + ", mName=" + mName + ", rating=" + rating + "]";
	}
}
