package com.stephaneki.monvelib.fragments.profile;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stephaneki.monvelib.R;
import com.stephaneki.monvelib.modele.jcDecaux.Contract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stephaneki on 12/09/2018 .
 */
public class ContractsAdapter extends RecyclerView.Adapter<ContractViewHolder> implements ContractViewHolder.OnItemSelectedListener {

    private List<Contract> mContracts = new ArrayList<>();
    private String mSelectedContractName;

    public ContractsAdapter(@Nullable List<Contract> contracts, String selectedContractName) {
        if (contracts != null) mContracts = contracts;
        mSelectedContractName = selectedContractName;
    }

    @NonNull
    @Override
    public ContractViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contract, parent, false);

        return new ContractViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ContractViewHolder holder, int position) {
        Contract contract = mContracts.get(position);
        holder.mCheckedTextView.setText(contract.getName());
        holder.mCheckedTextView.setChecked(contract.getName().equals(mSelectedContractName));
        holder.mItem = contract;
    }

    @Override
    public int getItemCount() {
        return mContracts.size();
    }

    @Override
    public void onItemSelected(Contract item) {
        mSelectedContractName = item.getName();
    }
}
