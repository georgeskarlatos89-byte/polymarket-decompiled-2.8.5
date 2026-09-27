package com.google.android.libraries.places.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzbut;
import com.google.android.libraries.places.internal.zzta;
import com.google.android.libraries.places.widget.internal.placedetails.zzby;
import com.google.android.libraries.places.widget.internal.placedetails.zzcb;
import com.google.android.libraries.places.widget.internal.placedetails.zzcm;
import com.google.android.libraries.places.widget.internal.placedetails.zzcx;
import com.google.android.libraries.places.widget.internal.placedetails.zzdp;
import com.google.android.libraries.places.widget.model.Orientation;
import defpackage.dmk;
import defpackage.lvf;
import defpackage.rwh;
import defpackage.ug7;
import defpackage.wg7;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", "Landroidx/fragment/app/o;", "", "placeId", "", "loadWithPlaceId", "(Ljava/lang/String;)V", "resourceName", "loadWithResourceName", "Lcom/google/android/gms/maps/model/LatLng;", "coordinates", "loadWithCoordinates", "(Lcom/google/android/gms/maps/model/LatLng;)V", "Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "listener", "setPlaceLoadListener", "(Lcom/google/android/libraries/places/widget/PlaceLoadListener;)V", "Companion", "Content", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaceDetailsFragment extends o {
    public zzcm zza;
    private final zzcx zzb = new zzcx(this);
    private zzby zzc;
    private zzcb zzd;
    private PlaceLoadListener zze;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final List<Content> STANDARD_CONTENT = CollectionsKt.listOf(Content.MEDIA, Content.ADDRESS, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON, Content.SUMMARY, Content.OPENING_HOURS, Content.WEBSITE, Content.PHONE_NUMBER, Content.TYPE_SPECIFIC_HIGHLIGHTS, Content.REVIEWS, Content.FEATURES);
    public static final List<Content> ALL_CONTENT = CollectionsKt.M0(Content.getEntries());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS", "SUMMARY", "OPENING_HOURS", "WEBSITE", "PHONE_NUMBER", "TYPE_SPECIFIC_HIGHLIGHTS", "REVIEWS", "PLUS_CODE", "FEATURES", "GENERATIVE_SUMMARY", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Content {
        public static final Content ACCESSIBLE_ENTRANCE_ICON;
        public static final Content ADDRESS;
        public static final Content FEATURES;
        public static final Content GENERATIVE_SUMMARY;
        public static final Content MEDIA;
        public static final Content OPENING_HOURS;
        public static final Content OPEN_NOW_STATUS;
        public static final Content PHONE_NUMBER;
        public static final Content PLUS_CODE;
        public static final Content PRICE;
        public static final Content RATING;
        public static final Content REVIEWS;
        public static final Content SUMMARY;
        public static final Content TYPE;
        public static final Content TYPE_SPECIFIC_HIGHLIGHTS;
        public static final Content WEBSITE;
        private static final /* synthetic */ Content[] zza;
        private static final /* synthetic */ ug7 zzb;

        static {
            Content content = new Content("MEDIA", 0);
            MEDIA = content;
            Content content2 = new Content("ADDRESS", 1);
            ADDRESS = content2;
            Content content3 = new Content("RATING", 2);
            RATING = content3;
            Content content4 = new Content("PRICE", 3);
            PRICE = content4;
            Content content5 = new Content("TYPE", 4);
            TYPE = content5;
            Content content6 = new Content("ACCESSIBLE_ENTRANCE_ICON", 5);
            ACCESSIBLE_ENTRANCE_ICON = content6;
            Content content7 = new Content("OPEN_NOW_STATUS", 6);
            OPEN_NOW_STATUS = content7;
            Content content8 = new Content("SUMMARY", 7);
            SUMMARY = content8;
            Content content9 = new Content("OPENING_HOURS", 8);
            OPENING_HOURS = content9;
            Content content10 = new Content("WEBSITE", 9);
            WEBSITE = content10;
            Content content11 = new Content("PHONE_NUMBER", 10);
            PHONE_NUMBER = content11;
            Content content12 = new Content("TYPE_SPECIFIC_HIGHLIGHTS", 11);
            TYPE_SPECIFIC_HIGHLIGHTS = content12;
            Content content13 = new Content("REVIEWS", 12);
            REVIEWS = content13;
            Content content14 = new Content("PLUS_CODE", 13);
            PLUS_CODE = content14;
            Content content15 = new Content("FEATURES", 14);
            FEATURES = content15;
            Content content16 = new Content("GENERATIVE_SUMMARY", 15);
            GENERATIVE_SUMMARY = content16;
            Content[] contentArr = {content, content2, content3, content4, content5, content6, content7, content8, content9, content10, content11, content12, content13, content14, content15, content16};
            zza = contentArr;
            zzb = new wg7(contentArr);
        }

        private Content(String str, int i) {
        }

        public static ug7 getEntries() {
            return zzb;
        }

        public static Content valueOf(String str) {
            return (Content) Enum.valueOf(Content.class, str);
        }

        public static Content[] values() {
            return (Content[]) zza.clone();
        }
    }

    public static final PlaceDetailsFragment newInstance(List<? extends Content> list) {
        return INSTANCE.newInstance(list);
    }

    public final void loadWithCoordinates(LatLng coordinates) {
        coordinates.getClass();
        zzby zzbyVar = this.zzc;
        if (zzbyVar != null) {
            zzbyVar.zze(coordinates);
        } else {
            Intrinsics.i("controller");
            throw null;
        }
    }

    public final void loadWithPlaceId(String placeId) {
        placeId.getClass();
        zzby zzbyVar = this.zzc;
        if (zzbyVar != null) {
            zzbyVar.zzc(placeId);
        } else {
            Intrinsics.i("controller");
            throw null;
        }
    }

    public final void loadWithResourceName(String resourceName) {
        resourceName.getClass();
        zzby zzbyVar = this.zzc;
        if (zzbyVar != null) {
            zzbyVar.zzd(resourceName);
        } else {
            Intrinsics.i("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.zzb.zza(context, null, zzbut.PLACE_DETAILS);
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzcm zzcmVar = this.zza;
        if (zzcmVar != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            rwh rwhVar = new rwh(viewModelStore, zzcmVar, defaultViewModelCreationExtras);
            KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(zzcb.class);
            orCreateKotlinClass.getClass();
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            if (qualifiedName != null) {
                this.zzd = (zzcb) rwhVar.d("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                return;
            } else {
                dmk.v("Local and anonymous classes can not be ViewModels");
                return;
            }
        }
        Intrinsics.i("viewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), requireArguments().getInt("arg-theme-res-id"))).inflate(R.layout.place_details_vertical_fragment, viewGroup, false);
        inflate.getClass();
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        zzby zzbyVar = this.zzc;
        if (zzbyVar != null) {
            zzbyVar.zzb(bundle);
        } else {
            Intrinsics.i("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        zzdp zzdpVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        List zza = ((zzbl) zzta.zza(requireArguments, "arg-content", zzbl.class)).zza();
        Bundle requireArguments2 = requireArguments();
        requireArguments2.getClass();
        Orientation orientation = (Orientation) zzta.zza(requireArguments2, "arg-orientation", Orientation.class);
        int i = requireArguments().getInt("arg-theme-res-id");
        if (orientation == Orientation.HORIZONTAL) {
            m0.p("PlaceDetailsFragment", "Horizontal orientation is not yet available.");
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        a0 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        zzcb zzcbVar = this.zzd;
        if (zzcbVar != null) {
            List<Content> list = zza;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
            for (Content content : list) {
                Content content2 = Content.MEDIA;
                switch (content.ordinal()) {
                    case 0:
                        zzdpVar = zzdp.MEDIA;
                        break;
                    case 1:
                        zzdpVar = zzdp.ADDRESS;
                        break;
                    case 2:
                        zzdpVar = zzdp.RATING;
                        break;
                    case 3:
                        zzdpVar = zzdp.PRICE;
                        break;
                    case 4:
                        zzdpVar = zzdp.TYPE;
                        break;
                    case 5:
                        zzdpVar = zzdp.ACCESSIBLE_ENTRANCE_ICON;
                        break;
                    case 6:
                        zzdpVar = zzdp.OPEN_NOW_STATUS;
                        break;
                    case 7:
                        zzdpVar = zzdp.SUMMARY;
                        break;
                    case 8:
                        zzdpVar = zzdp.OPENING_HOURS;
                        break;
                    case 9:
                        zzdpVar = zzdp.WEBSITE;
                        break;
                    case 10:
                        zzdpVar = zzdp.PHONE_NUMBER;
                        break;
                    case 11:
                        zzdpVar = zzdp.TYPE_SPECIFIC_HIGHLIGHTS;
                        break;
                    case 12:
                        zzdpVar = zzdp.REVIEWS;
                        break;
                    case 13:
                        zzdpVar = zzdp.PLUS_CODE;
                        break;
                    case 14:
                        zzdpVar = zzdp.FEATURES;
                        break;
                    case 15:
                        zzdpVar = zzdp.GENERATIVE_SUMMARY;
                        break;
                    default:
                        dmk.a();
                        return;
                }
                arrayList.add(zzdpVar);
            }
            zzby zzbyVar = new zzby(view, viewLifecycleOwner, childFragmentManager, zzcbVar, arrayList, orientation, i, bundle, false);
            this.zzc = zzbyVar;
            PlaceLoadListener placeLoadListener = this.zze;
            if (placeLoadListener != null) {
                zzbyVar.zzf(placeLoadListener);
                return;
            }
            return;
        }
        Intrinsics.i("viewModel");
        throw null;
    }

    public final void setPlaceLoadListener(PlaceLoadListener listener) {
        listener.getClass();
        this.zze = listener;
        zzby zzbyVar = this.zzc;
        if (zzbyVar != null) {
            zzbyVar.zzf(listener);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001J*\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u0018H\u0007R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_ORIENTATION", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "ARG_SHOW_LEGAL_DISCLOSURES", "getARG_SHOW_LEGAL_DISCLOSURES$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", "content", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ PlaceDetailsFragment newInstance$default(Companion companion, List list, Orientation orientation, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                orientation = Orientation.VERTICAL;
            }
            if ((i2 & 4) != 0) {
                i = R.style.PlacesMaterialTheme;
            }
            return companion.newInstance(list, orientation, i);
        }

        public final PlaceDetailsFragment newInstance(List<? extends Content> content, Orientation orientation, int theme) {
            content.getClass();
            orientation.getClass();
            PlaceDetailsFragment placeDetailsFragment = new PlaceDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-content", new zzbl(content));
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putInt("arg-theme-res-id", theme);
            placeDetailsFragment.setArguments(bundle);
            return placeDetailsFragment;
        }

        private Companion() {
            throw null;
        }

        public final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation) {
            list.getClass();
            orientation.getClass();
            return newInstance$default(this, list, orientation, 0, 4, null);
        }

        public final PlaceDetailsFragment newInstance(List<? extends Content> list) {
            list.getClass();
            return newInstance$default(this, list, null, 0, 6, null);
        }
    }

    public static final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation) {
        return INSTANCE.newInstance(list, orientation);
    }

    public static final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation, int i) {
        return INSTANCE.newInstance(list, orientation, i);
    }
}
