package com.google.android.libraries.places.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView;
import defpackage.coc;
import defpackage.t85;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzwi extends c {
    public static final /* synthetic */ int zza = 0;
    private static final Lazy zzh = LazyKt.lazy(zzwd.zza);
    private final List zzb;
    private final zztv zzc;
    private final t85 zzd;
    private final int zze;
    private final com.google.android.libraries.places.widget.internal.placedetails.zzt zzf;
    private final Function0 zzg;

    public zzwi(List list, zztv zztvVar, t85 t85Var, int i, com.google.android.libraries.places.widget.internal.placedetails.zzt zztVar, Function0 function0) {
        list.getClass();
        t85Var.getClass();
        zztVar.getClass();
        function0.getClass();
        this.zzb = list;
        this.zzc = zztvVar;
        this.zzd = t85Var;
        this.zze = i;
        this.zzf = zztVar;
        this.zzg = function0;
    }

    public static final /* synthetic */ zztv zzb(zzwi zzwiVar) {
        return zzwiVar.zzc;
    }

    public static /* synthetic */ void zzc(zzwf zzwfVar, zzwi zzwiVar, Review review, View view) {
        zzwfVar.zzi().setVisibility(8);
        zzwfVar.zzj().setVisibility(8);
        zzwfVar.zzk().setVisibility(0);
        TextView zzf = zzwfVar.zzf();
        String originalText = review.getOriginalText();
        if (originalText == null) {
            originalText = "";
        }
        zzi(zzf, originalText);
        zzwiVar.zzg.invoke();
    }

    public static /* synthetic */ void zzd(zzwf zzwfVar, zzwi zzwiVar, Review review, View view) {
        zzwfVar.zzi().setVisibility(0);
        zzwfVar.zzj().setVisibility(0);
        zzwfVar.zzk().setVisibility(8);
        TextView zzf = zzwfVar.zzf();
        String text = review.getText();
        if (text == null) {
            text = "";
        }
        zzi(zzf, text);
        zzwiVar.zzg.invoke();
    }

    public static /* synthetic */ void zze(Context context, zzwi zzwiVar, Review review, View view) {
        zzh(context, zzwiVar, review, view);
    }

    public static /* synthetic */ boolean zzf(zzwi zzwiVar, Context context, Review review, MenuItem menuItem) {
        return zzg(zzwiVar, context, review, menuItem);
    }

    private static final boolean zzg(zzwi zzwiVar, Context context, Review review, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.report_review_menu_option) {
            com.google.android.libraries.places.widget.internal.placedetails.zzt zztVar = zzwiVar.zzf;
            context.getClass();
            zztVar.zzl(context);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(review.getFlagContentUri());
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
                new zztu(context, zzwiVar.zze).show();
            }
        } else if (itemId == R.id.open_in_maps_menu_option) {
            com.google.android.libraries.places.widget.internal.placedetails.zzt zztVar2 = zzwiVar.zzf;
            context.getClass();
            zztVar2.zzx(context);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(review.getGoogleMapsUri());
            try {
                context.startActivity(intent2);
                return true;
            } catch (ActivityNotFoundException unused2) {
                new zztu(context, zzwiVar.zze).show();
            }
        } else {
            return false;
        }
        return true;
    }

    private static final void zzh(Context context, zzwi zzwiVar, Review review, View view) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        String uri2 = review.getAuthorAttribution().getUri();
        if (uri2 != null) {
            uri = Uri.parse(uri2);
            uri.getClass();
        } else {
            uri = null;
        }
        intent.setData(uri);
        try {
            context.startActivity(intent);
            zzwiVar.zzf.zzj(context);
        } catch (ActivityNotFoundException unused) {
            context.getClass();
            new zztu(context, zzwiVar.zze).show();
        }
    }

    private static final void zzi(View view, CharSequence charSequence) {
        if (charSequence != null && !StringsKt.T(charSequence)) {
            if (view instanceof TextView) {
                ((TextView) view).setText(charSequence);
            }
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.zzb.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ void onBindViewHolder(g gVar, int i) {
        zza((zzwf) gVar, i);
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_details_reviews_item, viewGroup, false);
        inflate.getClass();
        return new zzwf(inflate);
    }

    public final void zza(zzwf zzwfVar, int i) {
        final zzwi zzwiVar;
        final zzwf zzwfVar2;
        String textLanguageCode;
        String originalTextLanguageCode;
        zzwfVar.getClass();
        final Review review = (Review) this.zzb.get(i);
        final Context context = zzwfVar.itemView.getContext();
        String photoUri = review.getAuthorAttribution().getPhotoUri();
        Drawable drawable = context.getDrawable(R.drawable.review_author_image_placeholder);
        zzwfVar.zzb().setImageDrawable(drawable);
        String str = null;
        if (photoUri != null) {
            zzwiVar = this;
            zzwfVar2 = zzwfVar;
            coc.c(this.zzd, null, null, new zzwh(zzwiVar, photoUri, zzwfVar2, drawable, null), 3);
        } else {
            zzwiVar = this;
            zzwfVar2 = zzwfVar;
        }
        zzi(zzwfVar2.zzc(), review.getAuthorAttribution().getName());
        zzi(zzwfVar2.zzd(), review.getRelativePublishTimeDescription());
        RatingStarsView zze = zzwfVar2.zze();
        Double rating = review.getRating();
        rating.getClass();
        zze.zza(rating.doubleValue());
        TextView zzf = zzwfVar2.zzf();
        String text = review.getText();
        if (text == null) {
            text = "";
        }
        zzi(zzf, text);
        if (!Intrinsics.areEqual(review.getTextLanguageCode(), review.getOriginalTextLanguageCode()) && (textLanguageCode = review.getTextLanguageCode()) != null && !StringsKt.T(textLanguageCode) && (originalTextLanguageCode = review.getOriginalTextLanguageCode()) != null && !StringsKt.T(originalTextLanguageCode)) {
            String originalTextLanguageCode2 = review.getOriginalTextLanguageCode();
            originalTextLanguageCode2.getClass();
            String displayName = Locale.forLanguageTag(originalTextLanguageCode2).getDisplayName();
            displayName.getClass();
            String string = context.getString(R.string.place_details_see_original, displayName);
            string.getClass();
            zzi(zzwfVar2.zzj(), string);
            zzwfVar2.zzj().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzwe
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    zzwi.zzc(zzwf.this, zzwiVar, review, view);
                }
            });
            zzwfVar2.zzk().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzvz
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    zzwi.zzd(zzwf.this, zzwiVar, review, view);
                }
            });
            zzwfVar2.zzl().setVisibility(0);
            zzwfVar2.zzi().setVisibility(0);
            zzwfVar2.zzk().setVisibility(8);
        } else {
            zzwfVar2.zzl().setVisibility(8);
            zzwfVar2.zzi().setVisibility(8);
            zzwfVar2.zzj().setVisibility(8);
            zzwfVar2.zzk().setVisibility(8);
        }
        LocalDate visitDate = review.getVisitDate();
        if (visitDate != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            calendar.clear();
            calendar.set(visitDate.getYear(), visitDate.getMonth() - 1, visitDate.getDay());
            str = context.getString(R.string.place_details_visited_text, ((SimpleDateFormat) zzh.getValue()).format(calendar.getTime()));
        }
        zzi(zzwfVar2.zzg(), str);
        zzwfVar2.zzh().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzwa
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                final Context context2 = context;
                PopupMenu popupMenu = new PopupMenu(context2, view);
                popupMenu.inflate(R.menu.review_more_menu);
                final Review review2 = review;
                if (review2.getGoogleMapsUri() == null) {
                    popupMenu.getMenu().removeItem(R.id.open_in_maps_menu_option);
                }
                final zzwi zzwiVar2 = zzwiVar;
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.internal.zzwc
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final /* synthetic */ boolean onMenuItemClick(MenuItem menuItem) {
                        return zzwi.zzf(zzwi.this, context2, review2, menuItem);
                    }
                });
                popupMenu.show();
            }
        });
        zzwfVar2.zza().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzwb
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zzwi.zze(context, zzwiVar, review, view);
            }
        });
        ConstraintLayout zza2 = zzwfVar2.zza();
        View view = zzwfVar2.itemView;
        view.getClass();
        zzsv.zza(zza2, view, context, 48, 48);
        zzwfVar2.zza().setContentDescription(context.getString(R.string.place_details_view_review_author_content_description, review.getAuthorAttribution().getName()));
        zzsv.zzb(zzwfVar2.zza());
    }
}
