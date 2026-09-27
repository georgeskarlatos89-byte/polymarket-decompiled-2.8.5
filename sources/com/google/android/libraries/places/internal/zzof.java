package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalDate;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import com.google.android.libraries.places.api.model.SpecialDay;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.internal.zzoj;
import defpackage.brn;
import defpackage.jr9;
import defpackage.mr9;
import defpackage.qd0;
import defpackage.sv6;
import defpackage.vca;
import defpackage.vt1;
import defpackage.wca;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzof {
    private static final mr9 zza;
    private static final mr9 zzb;

    static {
        vt1 a = mr9.a();
        a.w("OPERATIONAL", Place.BusinessStatus.OPERATIONAL);
        a.w("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY);
        a.w("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY);
        zza = a.f(true);
        vt1 a2 = mr9.a();
        a2.w("ACCESS", OpeningHours.HoursType.ACCESS);
        a2.w("BREAKFAST", OpeningHours.HoursType.BREAKFAST);
        a2.w("BRUNCH", OpeningHours.HoursType.BRUNCH);
        a2.w("DELIVERY", OpeningHours.HoursType.DELIVERY);
        a2.w("DINNER", OpeningHours.HoursType.DINNER);
        a2.w("DRIVE_THROUGH", OpeningHours.HoursType.DRIVE_THROUGH);
        a2.w("HAPPY_HOUR", OpeningHours.HoursType.HAPPY_HOUR);
        a2.w("KITCHEN", OpeningHours.HoursType.KITCHEN);
        a2.w("LUNCH", OpeningHours.HoursType.LUNCH);
        a2.w("ONLINE_SERVICE_HOURS", OpeningHours.HoursType.ONLINE_SERVICE_HOURS);
        a2.w("PICKUP", OpeningHours.HoursType.PICKUP);
        a2.w("SENIOR_HOURS", OpeningHours.HoursType.SENIOR_HOURS);
        a2.w("TAKEOUT", OpeningHours.HoursType.TAKEOUT);
        zzb = a2.f(true);
    }

    public static TimeOfWeek zza(zzoj.zzd.zzc zzcVar) {
        boolean z;
        DayOfWeek dayOfWeek;
        LocalDate localDate = null;
        if (zzcVar == null) {
            return null;
        }
        try {
            Integer zza2 = zzcVar.zza();
            brn.m(zza2, "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            String zzb2 = zzcVar.zzb();
            brn.m(zzb2, "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            String str = "Unable to convert " + zzb2 + " to LocalTime, must be of format \"hhmm\".";
            if (zzb2.length() == 4) {
                z = true;
            } else {
                z = false;
            }
            brn.g(str, z);
            try {
                LocalTime newInstance = LocalTime.newInstance(Integer.parseInt(zzb2.substring(0, 2)), Integer.parseInt(zzb2.substring(2, 4)));
                newInstance.getClass();
                try {
                    localDate = zzb(zzcVar.zzc());
                } catch (IllegalArgumentException unused) {
                }
                switch (zza2.intValue()) {
                    case 0:
                        dayOfWeek = DayOfWeek.SUNDAY;
                        break;
                    case 1:
                        dayOfWeek = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        dayOfWeek = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        dayOfWeek = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        dayOfWeek = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        dayOfWeek = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        dayOfWeek = DayOfWeek.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                }
                TimeOfWeek.Builder builder = TimeOfWeek.builder(dayOfWeek, newInstance);
                builder.setDate(localDate);
                builder.setTruncated(Objects.equals(zzcVar.zzd(), Boolean.TRUE));
                return builder.build();
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(str, e);
            }
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public static LocalDate zzb(String str) {
        if (str != null) {
            try {
                return LocalDate.newInstance(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(sv6.n("Unable to convert ", str, " to LocalDate; date should be in format YYYY-MM-DD."), e);
            }
        }
        return null;
    }

    public static List zzc(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static Place.BooleanPlaceAttributeValue zzd(Boolean bool) {
        if (bool == null) {
            return Place.BooleanPlaceAttributeValue.UNKNOWN;
        }
        if (bool.booleanValue()) {
            return Place.BooleanPlaceAttributeValue.TRUE;
        }
        return Place.BooleanPlaceAttributeValue.FALSE;
    }

    public static List zze(List list) {
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Place zzf(zzoj zzojVar, List list) {
        AddressComponents newInstance;
        AddressComponent build;
        LatLng latLng;
        LatLngBounds latLngBounds;
        Uri uri;
        String str;
        Integer valueOf;
        Object obj;
        zzoj.zzb zzg;
        String zzb2;
        zzoj.zzb zzg2;
        String zza2;
        jr9<zzoj.zze> zzo;
        ArrayList arrayList;
        zzoj.zzf zzq;
        PlusCode build2;
        jr9 zzu;
        String c;
        int intValue;
        PhotoMetadata build3;
        Place.Builder builder = Place.builder();
        builder.setAttributions(list);
        if (zzojVar != null) {
            jr9<zzoj.zza> zza3 = zzojVar.zza();
            ArrayList arrayList2 = null;
            if (zza3.isEmpty()) {
                newInstance = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (zzoj.zza zzaVar : zza3) {
                    if (zzaVar == null) {
                        build = null;
                    } else {
                        try {
                            String zza4 = zzaVar.zza();
                            zza4.getClass();
                            AddressComponent.Builder builder2 = AddressComponent.builder(zza4, zzaVar.zzc());
                            builder2.setShortName(zzaVar.zzb());
                            build = builder2.build();
                        } catch (IllegalStateException | NullPointerException e) {
                            throw zzi(sv6.n("AddressComponent not properly defined (", e.getMessage(), ")."));
                        }
                    }
                    zzj(arrayList3, build);
                }
                newInstance = AddressComponents.newInstance(arrayList3);
            }
            zzoj.zzc zzi = zzojVar.zzi();
            if (zzi != null) {
                latLng = zzh(zzi.zza());
                zzoj.zzc.zzb zzb3 = zzi.zzb();
                if (zzb3 != null) {
                    LatLng zzh = zzh(zzb3.zzb());
                    LatLng zzh2 = zzh(zzb3.zza());
                    if (zzh != null && zzh2 != null) {
                        latLngBounds = new LatLngBounds(zzh, zzh2);
                    }
                }
                latLngBounds = null;
            } else {
                latLng = null;
                latLngBounds = null;
            }
            String zzF = zzojVar.zzF();
            if (zzF != null) {
                uri = Uri.parse(zzF);
            } else {
                uri = null;
            }
            String zzk = zzojVar.zzk();
            if (zzk != null) {
                str = zzk.concat(".png");
            } else {
                str = null;
            }
            String zzj = zzojVar.zzj();
            if (zzj != null) {
                try {
                    valueOf = Integer.valueOf(Color.parseColor(zzj));
                } catch (IllegalArgumentException unused) {
                }
                builder.setAddressComponents(newInstance);
                obj = zza.get(zzojVar.zzb());
                if (obj == null) {
                    obj = null;
                }
                builder.setBusinessStatus((Place.BusinessStatus) obj);
                builder.setCurbsidePickup(zzd(zzojVar.zzc()));
                builder.setCurrentOpeningHours(zzg(zzojVar.zzd()));
                builder.setDelivery(zzd(zzojVar.zze()));
                builder.setDineIn(zzd(zzojVar.zzf()));
                builder.setDisplayName(zzojVar.zzm());
                zzg = zzojVar.zzg();
                if (zzg != null) {
                    zzb2 = null;
                } else {
                    zzb2 = zzg.zzb();
                }
                builder.setEditorialSummary(zzb2);
                zzg2 = zzojVar.zzg();
                if (zzg2 != null) {
                    zza2 = null;
                } else {
                    zza2 = zzg2.zza();
                }
                builder.setEditorialSummaryLanguageCode(zza2);
                builder.setFormattedAddress(zzojVar.zzh());
                builder.setIconBackgroundColor(valueOf);
                builder.setIconMaskUrl(str);
                builder.setId(zzojVar.zzp());
                builder.setInternationalPhoneNumber(zzojVar.zzl());
                builder.setLocation(latLng);
                builder.setOpeningHours(zzg(zzojVar.zzn()));
                zzo = zzojVar.zzo();
                if (zzo.isEmpty()) {
                    arrayList = new ArrayList();
                    for (zzoj.zze zzeVar : zzo) {
                        if (zzeVar == null) {
                            build3 = null;
                        } else {
                            String zzc = zzeVar.zzc();
                            if (!TextUtils.isEmpty(zzc)) {
                                Integer zza5 = zzeVar.zza();
                                Integer zzb4 = zzeVar.zzb();
                                PhotoMetadata.Builder builder3 = PhotoMetadata.builder(zzc);
                                jr9 zzd = zzeVar.zzd();
                                if (zzd.isEmpty()) {
                                    c = "";
                                } else {
                                    wca wcaVar = new wca(", ");
                                    c = new vca(wcaVar, wcaVar).c(zzd);
                                }
                                builder3.setAttributions(c);
                                int i = 0;
                                if (zza5 == null) {
                                    intValue = 0;
                                } else {
                                    intValue = zza5.intValue();
                                }
                                builder3.setHeight(intValue);
                                if (zzb4 != null) {
                                    i = zzb4.intValue();
                                }
                                builder3.setWidth(i);
                                build3 = builder3.build();
                            } else {
                                throw zzi("Photo reference not provided for a PhotoMetadata result.");
                            }
                        }
                        zzj(arrayList, build3);
                    }
                } else {
                    arrayList = null;
                }
                builder.setPhotoMetadatas(arrayList);
                builder.setPlaceTypes(zzc(zzojVar.zzC()));
                zzq = zzojVar.zzq();
                if (zzq != null) {
                    build2 = null;
                } else {
                    PlusCode.Builder builder4 = PlusCode.builder();
                    builder4.setCompoundCode(zzq.zza());
                    builder4.setGlobalCode(zzq.zzb());
                    build2 = builder4.build();
                }
                builder.setPlusCode(build2);
                builder.setPriceLevel(zzojVar.zzr());
                builder.setRating(zzojVar.zzs());
                builder.setReservable(zzd(zzojVar.zzt()));
                zzu = zzojVar.zzu();
                if (!zzu.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = zzu.iterator();
                    while (it.hasNext()) {
                        zzj(arrayList4, zzg((zzoj.zzd) it.next()));
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList2 = arrayList4;
                    }
                }
                builder.setSecondaryOpeningHours(arrayList2);
                builder.setServesBeer(zzd(zzojVar.zzv()));
                builder.setServesBreakfast(zzd(zzojVar.zzw()));
                builder.setServesBrunch(zzd(zzojVar.zzw()));
                builder.setServesDinner(zzd(zzojVar.zzx()));
                builder.setServesLunch(zzd(zzojVar.zzy()));
                builder.setServesVegetarianFood(zzd(zzojVar.zzz()));
                builder.setServesWine(zzd(zzojVar.zzA()));
                builder.setTakeout(zzd(zzojVar.zzB()));
                builder.setUserRatingCount(zzojVar.zzD());
                builder.setUtcOffsetMinutes(zzojVar.zzE());
                builder.setViewport(latLngBounds);
                builder.setWebsiteUri(uri);
            }
            valueOf = null;
            builder.setAddressComponents(newInstance);
            obj = zza.get(zzojVar.zzb());
            if (obj == null) {
            }
            builder.setBusinessStatus((Place.BusinessStatus) obj);
            builder.setCurbsidePickup(zzd(zzojVar.zzc()));
            builder.setCurrentOpeningHours(zzg(zzojVar.zzd()));
            builder.setDelivery(zzd(zzojVar.zze()));
            builder.setDineIn(zzd(zzojVar.zzf()));
            builder.setDisplayName(zzojVar.zzm());
            zzg = zzojVar.zzg();
            if (zzg != null) {
            }
            builder.setEditorialSummary(zzb2);
            zzg2 = zzojVar.zzg();
            if (zzg2 != null) {
            }
            builder.setEditorialSummaryLanguageCode(zza2);
            builder.setFormattedAddress(zzojVar.zzh());
            builder.setIconBackgroundColor(valueOf);
            builder.setIconMaskUrl(str);
            builder.setId(zzojVar.zzp());
            builder.setInternationalPhoneNumber(zzojVar.zzl());
            builder.setLocation(latLng);
            builder.setOpeningHours(zzg(zzojVar.zzn()));
            zzo = zzojVar.zzo();
            if (zzo.isEmpty()) {
            }
            builder.setPhotoMetadatas(arrayList);
            builder.setPlaceTypes(zzc(zzojVar.zzC()));
            zzq = zzojVar.zzq();
            if (zzq != null) {
            }
            builder.setPlusCode(build2);
            builder.setPriceLevel(zzojVar.zzr());
            builder.setRating(zzojVar.zzs());
            builder.setReservable(zzd(zzojVar.zzt()));
            zzu = zzojVar.zzu();
            if (!zzu.isEmpty()) {
            }
            builder.setSecondaryOpeningHours(arrayList2);
            builder.setServesBeer(zzd(zzojVar.zzv()));
            builder.setServesBreakfast(zzd(zzojVar.zzw()));
            builder.setServesBrunch(zzd(zzojVar.zzw()));
            builder.setServesDinner(zzd(zzojVar.zzx()));
            builder.setServesLunch(zzd(zzojVar.zzy()));
            builder.setServesVegetarianFood(zzd(zzojVar.zzz()));
            builder.setServesWine(zzd(zzojVar.zzA()));
            builder.setTakeout(zzd(zzojVar.zzB()));
            builder.setUserRatingCount(zzojVar.zzD());
            builder.setUtcOffsetMinutes(zzojVar.zzE());
            builder.setViewport(latLngBounds);
            builder.setWebsiteUri(uri);
        }
        return builder.build();
    }

    private static OpeningHours zzg(zzoj.zzd zzdVar) {
        ArrayList arrayList;
        SpecialDay build;
        Period period;
        if (zzdVar == null) {
            return null;
        }
        OpeningHours.Builder builder = OpeningHours.builder();
        jr9<zzoj.zzd.zza> zza2 = zzdVar.zza();
        if (!zza2.isEmpty()) {
            arrayList = new ArrayList();
            for (zzoj.zzd.zza zzaVar : zza2) {
                if (zzaVar != null) {
                    Period.Builder builder2 = Period.builder();
                    builder2.setOpen(zza(zzaVar.zzb()));
                    builder2.setClose(zza(zzaVar.zza()));
                    period = builder2.build();
                } else {
                    period = null;
                }
                zzj(arrayList, period);
            }
        } else {
            arrayList = null;
        }
        builder.setPeriods(zze(arrayList));
        builder.setWeekdayText(zzdVar.zzb());
        Object obj = zzb.get(zzdVar.zzc());
        if (obj == null) {
            obj = null;
        }
        builder.setHoursType((OpeningHours.HoursType) obj);
        jr9<zzoj.zzd.zzb> zzd = zzdVar.zzd();
        ArrayList arrayList2 = new ArrayList();
        if (!zzd.isEmpty()) {
            for (zzoj.zzd.zzb zzbVar : zzd) {
                if (zzbVar != null) {
                    try {
                        LocalDate zzb2 = zzb(zzbVar.zza());
                        zzb2.getClass();
                        SpecialDay.Builder builder3 = SpecialDay.builder(zzb2);
                        builder3.setExceptional(Objects.equals(zzbVar.zzb(), Boolean.TRUE));
                        build = builder3.build();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                    zzj(arrayList2, build);
                }
                build = null;
                zzj(arrayList2, build);
            }
        }
        builder.setSpecialDays(arrayList2);
        return builder.build();
    }

    private static LatLng zzh(zzoj.zzc.zza zzaVar) {
        if (zzaVar != null) {
            Double zza2 = zzaVar.zza();
            Double zzb2 = zzaVar.zzb();
            if (zza2 != null && zzb2 != null) {
                return new LatLng(zza2.doubleValue(), zzb2.doubleValue());
            }
            return null;
        }
        return null;
    }

    private static qd0 zzi(String str) {
        return new qd0(new Status(8, "Unexpected server error: ".concat(String.valueOf(str)), null, null));
    }

    private static boolean zzj(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }
}
