package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.FontUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class IntercomErrorView extends RelativeLayout {
    private Button actionButton;
    private TextView subtitle;
    private TextView titleView;

    public IntercomErrorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.empty_text_title);
        this.titleView = textView;
        FontUtils.setRobotoMediumTypeface(textView);
        this.subtitle = (TextView) findViewById(R.id.empty_text_subtitle);
        this.actionButton = (Button) findViewById(R.id.action_button);
    }

    public void setActionButtonClickListener(View.OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    public void setActionButtonText(int i) {
        this.actionButton.setText(i);
    }

    public void setActionButtonTextColor(int i) {
        this.actionButton.setTextColor(i);
    }

    public void setActionButtonVisibility(int i) {
        this.actionButton.setVisibility(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
    }

    public void setTitle(int i) {
        this.titleView.setText(i);
    }

    public IntercomErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSubtitle(int i) {
        this.subtitle.setText(i);
    }
}
