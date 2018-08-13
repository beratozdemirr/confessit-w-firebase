package com.confessit;

import android.view.View;

/**
 * Created by EVREN on 17.4.2018.
 */

//bu ınterface sayesınde recyc tıklanabilirlik özelliği sağladık


public interface CustomItemClickListener {
    void onItemClick(View v, int position);
}
