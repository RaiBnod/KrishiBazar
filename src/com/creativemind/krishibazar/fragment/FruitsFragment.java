package com.creativemind.krishibazar.fragment;

import com.creativemind.krishibazar.CustomList;
import com.creativemind.krishibazar.R;
import com.creativemind.krishibazar.chart.Chart;
import com.creativemind.krishibazar.dummydata.Price;
import com.creativemind.krishibazar.dummydata.ProductList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class FruitsFragment extends Fragment {
	ListView list;
	
	public FruitsFragment() {
		ProductList.populateFruitsData();
		Price.populateFruitsPrice();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		CustomList adapter = new CustomList(getActivity(), ProductList.productsFruits, Price.pricesFruits);
		list = (ListView) getActivity().findViewById(R.id.fruits_list);

		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(
						getActivity(),
						"You Clicked at "
								+ ProductList.productsFruits.get(position).getName(),
						Toast.LENGTH_SHORT).show();
				Chart chart = new Chart();
				chart.openChart(position, Price.pricesFruits, getActivity().getBaseContext());
			}
		});
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_fruits, container,
				false);
	}

}
