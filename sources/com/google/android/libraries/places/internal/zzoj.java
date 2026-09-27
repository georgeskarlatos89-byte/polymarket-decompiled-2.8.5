package com.google.android.libraries.places.internal;

import defpackage.jr9;
import defpackage.we8;
import defpackage.wwf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzoj {
    private zza[] addressComponents;
    private String businessStatus;
    private Boolean curbsidePickup;
    private zzd currentOpeningHours;
    private Boolean delivery;
    private Boolean dineIn;
    private zzb editorialSummary;
    private String formattedAddress;
    private zzc geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzd openingHours;
    private zze[] photos;
    private String placeId;
    private zzf plusCode;
    private Integer priceLevel;
    private Double rating;
    private Boolean reservable;
    private zzd[] secondaryOpeningHours;
    private Boolean servesBeer;
    private Boolean servesBreakfast;
    private Boolean servesBrunch;
    private Boolean servesDinner;
    private Boolean servesLunch;
    private Boolean servesVegetarianFood;
    private Boolean servesWine;
    private Boolean takeout;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;
    private Boolean wheelchairAccessibleEntrance;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        public final String zza() {
            return this.longName;
        }

        public final String zzb() {
            return this.shortName;
        }

        public final jr9 zzc() {
            String[] strArr = this.types;
            if (strArr != null) {
                return jr9.n(strArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zzb {
        private String language;
        private String overview;

        public final String zza() {
            return this.language;
        }

        public final String zzb() {
            return this.overview;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zzc {
        private zza location;
        private zzb viewport;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        class zza {
            private Double lat;
            private Double lng;

            public final Double zza() {
                return this.lat;
            }

            public final Double zzb() {
                return this.lng;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        class zzb {
            private zza northeast;
            private zza southwest;

            public final zza zza() {
                return this.northeast;
            }

            public final zza zzb() {
                return this.southwest;
            }
        }

        public final zza zza() {
            return this.location;
        }

        public final zzb zzb() {
            return this.viewport;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zzd {
        private zza[] periods;
        private zzb[] specialDays;
        private String type;
        private String[] weekdayText;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        class zza {
            private zzc close;
            private zzc open;

            public final zzc zza() {
                return this.close;
            }

            public final zzc zzb() {
                return this.open;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        class zzb {
            private String date;
            private Boolean exceptionalHours;

            public final String zza() {
                return this.date;
            }

            public final Boolean zzb() {
                return this.exceptionalHours;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        /* loaded from: classes3.dex */
        class zzc {
            private String date;
            private Integer day;
            private String time;
            private Boolean truncated;

            public final Integer zza() {
                return this.day;
            }

            public final String zzb() {
                return this.time;
            }

            public final String zzc() {
                return this.date;
            }

            public final Boolean zzd() {
                return this.truncated;
            }
        }

        public final jr9 zza() {
            zza[] zzaVarArr = this.periods;
            if (zzaVarArr != null) {
                return jr9.n(zzaVarArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }

        public final jr9 zzb() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return jr9.n(strArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }

        public final String zzc() {
            return this.type;
        }

        public final jr9 zzd() {
            zzb[] zzbVarArr = this.specialDays;
            if (zzbVarArr != null) {
                return jr9.n(zzbVarArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zze {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        public final Integer zza() {
            return this.height;
        }

        public final Integer zzb() {
            return this.width;
        }

        public final String zzc() {
            return this.photoReference;
        }

        public final jr9 zzd() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return jr9.n(strArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zzf {
        private String compoundCode;
        private String globalCode;

        public final String zza() {
            return this.compoundCode;
        }

        public final String zzb() {
            return this.globalCode;
        }
    }

    public final Boolean zzA() {
        return this.servesWine;
    }

    public final Boolean zzB() {
        return this.takeout;
    }

    public final jr9 zzC() {
        String[] strArr = this.types;
        if (strArr != null) {
            return jr9.n(strArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }

    public final Integer zzD() {
        return this.userRatingsTotal;
    }

    public final Integer zzE() {
        return this.utcOffset;
    }

    public final String zzF() {
        return this.website;
    }

    public final jr9 zza() {
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr != null) {
            return jr9.n(zzaVarArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }

    public final String zzb() {
        return this.businessStatus;
    }

    public final Boolean zzc() {
        return this.curbsidePickup;
    }

    public final zzd zzd() {
        return this.currentOpeningHours;
    }

    public final Boolean zze() {
        return this.delivery;
    }

    public final Boolean zzf() {
        return this.dineIn;
    }

    public final zzb zzg() {
        return this.editorialSummary;
    }

    public final String zzh() {
        return this.formattedAddress;
    }

    public final zzc zzi() {
        return this.geometry;
    }

    public final String zzj() {
        return this.iconBackgroundColor;
    }

    public final String zzk() {
        return this.iconMaskBaseUri;
    }

    public final String zzl() {
        return this.internationalPhoneNumber;
    }

    public final String zzm() {
        return this.name;
    }

    public final zzd zzn() {
        return this.openingHours;
    }

    public final jr9 zzo() {
        zze[] zzeVarArr = this.photos;
        if (zzeVarArr != null) {
            return jr9.n(zzeVarArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }

    public final String zzp() {
        return this.placeId;
    }

    public final zzf zzq() {
        return this.plusCode;
    }

    public final Integer zzr() {
        return this.priceLevel;
    }

    public final Double zzs() {
        return this.rating;
    }

    public final Boolean zzt() {
        return this.reservable;
    }

    public final jr9 zzu() {
        zzd[] zzdVarArr = this.secondaryOpeningHours;
        if (zzdVarArr != null) {
            return jr9.n(zzdVarArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }

    public final Boolean zzv() {
        return this.servesBeer;
    }

    public final Boolean zzw() {
        return this.servesBreakfast;
    }

    public final Boolean zzx() {
        return this.servesDinner;
    }

    public final Boolean zzy() {
        return this.servesLunch;
    }

    public final Boolean zzz() {
        return this.servesVegetarianFood;
    }
}
