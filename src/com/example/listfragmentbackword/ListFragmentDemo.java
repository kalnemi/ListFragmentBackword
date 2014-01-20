package com.example.listfragmentbackword;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class ListFragmentDemo extends ListFragment 
{
	String[] countries = new String [] { 
		"India",
		"Japan",
		"USA" 
	}; 
	@Override
	public View onCreateView ( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
	{
		ArrayAdapter<String> adapter = new ArrayAdapter<String> ( inflater.getContext(), android.R.layout.simple_list_item_1, countries );
		setListAdapter(adapter);
		
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onActivityCreated ( Bundle savedInstanceState )
	{
		super.onActivityCreated(savedInstanceState);
		OnItemClickListener listener = new OnItemClickListener() 
		{
			@Override
			public void onItemClick ( AdapterView<?> arg0, View arg1, int position, long id )
			{
				Toast.makeText( getActivity().getBaseContext(), countries[position], Toast.LENGTH_SHORT ).show();
			}
		};
		
		getListView().setOnItemClickListener(listener);
	}
}