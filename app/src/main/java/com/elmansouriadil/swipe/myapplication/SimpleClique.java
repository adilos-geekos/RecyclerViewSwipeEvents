package com.elmansouriadil.swipe.myapplication;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
public class SimpleClique extends  ItemTouchHelper.Callback {
    getAdapterData G;
    SimpleClique(getAdapterData g){
        G = g;
    }
    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        //swipe from left to right
        return makeMovementFlags(0,ItemTouchHelper.END);
    }
    //disable drag option

    @Override
    public boolean isLongPressDragEnabled() {
        return false;
    }

    // enable swipe


    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }
    // return false to disable drag
    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            G.getDataOnSwipe(viewHolder.getAdapterPosition());
    }
}
