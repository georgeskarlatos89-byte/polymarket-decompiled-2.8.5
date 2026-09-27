# polymarket-decompiled-2.8.5

Decompiled sources and resources of the Polymarket Android app.

- Package: `com.polymarket.android`
- Version: `2.8.5` (versionCode 21647)
- Source archive: `com.polymarket.android_2.8.5-21647_1arch_1dpi_24lang_f2e4518c1685644d672a327dcb04a7b6.apkm` (APKMirror bundle)
- Decompiled with: [jadx](https://github.com/skylot/jadx) 1.5.0 (OpenJDK 17)

## Layout

- `sources/` — Java sources produced from `base.apk`'s `classes*.dex` (20,240 files across `com`, `androidx`, `kotlin`, `okhttp3`, `io.intercom`, `io.sentry`, `coil3`, `org`, `bo`, `defpackage`, ...).
- `resources/` — decoded `AndroidManifest.xml`, `res/`, `assets/`, raw `classes.dex`–`classes6.dex`, `META-INF/`, and bundled `.properties` / notice files from `base.apk`.
- `splits/` — one directory per split APK from the APKM bundle (resource-only; no additional application code):
  - `arm64_v8a/` — 40 native `.so` libraries.
  - `xxxhdpi/` — density-specific drawables.
  - `ar/`, `de/`, `en/`, `es/`, `et/`, `fi/`, `fr/`, `hi/`, `hu/`, `in/`, `it/`, `ja/`, `ko/`, `ms/`, `nl/`, `pl/`, `pt/`, `ru/`, `sv/`, `th/`, `tr/`, `uk/`, `vi/`, `zh/` — 24 per-locale string resources.

## Notes

- `sources/defpackage/nul.java` and `sources/defpackage/prn.java` are stored as `nul_.java` and `prn_.java` because `nul` and `prn` are reserved device names on Windows and Git cannot open files with those exact base names.
- `splits/arm64_v8a/resources/lib/arm64-v8a/libUSLive.so` is ~84 MB. GitHub accepts it but flags files over 50 MB with a warning; it is under the 100 MB hard limit.
