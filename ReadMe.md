## MGM-Muhasebe İşlemler Projesi

## Geliştirme Ortamı Konfigurasyon
http://yte-confluence:8090/pages/viewpage.action?pageId=58984220

## Git ve Git üzerinden Kodun checkout edilmesi; 

http://yte-confluence:8090/display/MB/Git
### Eclipse Git
Kullanılacak Git Adresi: http://yte-stash:7990/projects/MB/repos/muhasebeislemleri/browse
http://yte-confluence:8090/display/MB/Eclipse+Git

## Projeye özgü ayarların yapılması
Projeye özgü ayarların yapılması için (veritabanı create edilmesi vb.) setting klasörü altında bulunan "settings.bat" dosyasını çalıştırınız.

### H2'nin başlatılması,
Eclipse üzerinde Ant View açılır.(Window->Show View->Other ->Ant) açılan ant consoluna build.xml bırakılır ve çift tıklanarak başlatılır. 
Açılan login sayfasında login olunduğunda h2 ayağa kaldırılmış olur. 
 
### Veritabanında changelog scriptlerinin çalışabilmesi için: 
Proje üzerinde sağa tıkla -> Run As -> 5Maven Build -> goals: "liquibase:update" çalıştırılmalıdır.
  
## Kodun derlenmesi;
Proje üzerinde sağa tıkla -> Run As -> 5Maven Build -> goal: clean install testler çalıştırılır ve proje install edilmiş olur. 
Proje Tomcat 8 üzerinde koşturulabilir. 

## Tasarım Kararları
[MGM Projesi Tasarım Kararlarına](http://yte-confluence:8090/pages/viewpage.action?pageId=58984988) uygun olarak geliştirilmektedir.# spring-contract-tests
