package com.stephaneki.monvelib.fragments.profile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckedTextView;

import com.stephaneki.monvelib.R;
import com.stephaneki.monvelib.modele.jcDecaux.Contract;

/**
 * Created by stephaneki on 12/09/2018 .
 */
public class ContractViewHolder extends RecyclerView.ViewHolder {

    CheckedTextView mCheckedTextView;
    Contract mItem;
    private OnItemSelectedListener mItemSelectedListener;

    public ContractViewHolder(View itemView, @NonNull OnItemSelectedListener listener) {
        super(itemView);
        this.mItemSelectedListener = listener;
        mCheckedTextView = itemView.findViewById(R.id.tv_contract_name);
        mCheckedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemSelectedListener.onItemSelected(mItem);
            }
        });
    }

    public interface OnItemSelectedListener {
        void onItemSelected(Contract item);
    }
}
