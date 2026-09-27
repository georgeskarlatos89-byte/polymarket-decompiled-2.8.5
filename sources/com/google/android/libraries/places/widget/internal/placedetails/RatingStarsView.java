package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.places.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/RatingStarsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stars", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "setRating", "", "rating", "", "StarsModel", "java.com.google.android.libraries.places.widget.internal.placedetails_rating_stars_view_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RatingStarsView extends FrameLayout {
    private final ImageView[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingStarsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.rating_stars_view, this);
        View findViewById = findViewById(R.id.rating_star_1);
        findViewById.getClass();
        View findViewById2 = findViewById(R.id.rating_star_2);
        findViewById2.getClass();
        View findViewById3 = findViewById(R.id.rating_star_3);
        findViewById3.getClass();
        View findViewById4 = findViewById(R.id.rating_star_4);
        findViewById4.getClass();
        View findViewById5 = findViewById(R.id.rating_star_5);
        findViewById5.getClass();
        this.zza = new ImageView[]{(ImageView) findViewById, (ImageView) findViewById2, (ImageView) findViewById3, (ImageView) findViewById4, (ImageView) findViewById5};
    }

    public final void zza(double d) {
        zzcz zza = zzcy.zza(d);
        ImageView[] imageViewArr = this.zza;
        int length = imageViewArr.length;
        for (int i = 0; i < 5; i++) {
            imageViewArr[i].setImageDrawable(getResources().getDrawable(zza.zza(i), getContext().getTheme()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingStarsView(Context context) {
        this(context, null, 2, null);
        context.getClass();
    }

    public /* synthetic */ RatingStarsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
