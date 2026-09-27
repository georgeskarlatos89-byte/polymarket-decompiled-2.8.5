package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m93 extends FrameLayout {
    public final Animation a;
    public final Animation b;

    public m93(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_in);
        loadAnimation.setAnimationListener(new l93(this, 0));
        this.a = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_out);
        loadAnimation2.setAnimationListener(new l93(this, 1));
        this.b = loadAnimation2;
        LayoutInflater.from(context).inflate(R.layout.stripe_card_widget_progress_view, this);
        if (((ProgressBar) m4n.d(this, R.id.card_loading)) != null) {
            setBackgroundResource(R.drawable.stripe_card_progress_background);
            setClipToOutline(true);
            setVisibility(4);
            return;
        }
        dmk.s("Missing required view with ID: ".concat(getResources().getResourceName(R.id.card_loading)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            setLayoutParams(layoutParams);
            return;
        }
        dmk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
