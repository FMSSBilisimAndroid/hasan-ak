# İsim Alanı (namespace) Nedir?
Aynı amaca hizmet eden özellikleri, sınıfları ve fonksiyonları bir çatı altında toplarken, bu çatıya verdiğimiz isime isim alanı (namespace) denir.
Bir namespace içerisine birbiriyle alakalı sınıf ve foksiyonları koymaya dikkat ederiz.

## 1-Namespace neden önemlidir?
Her sorun gibi, namespace kavramı da bir ihtiyaçtan doğmuştur. Nesne tabanlı dillerden önce (örneğin C dilinde) oluşturduğumuz bir sınıf veya değişken ismi proje genelinde bir daha kullanılamamaktaydı. Bu sebeple büyük projelerde, ekip halinde geliştirilen uygulamalarda isimleri standart halde tutmak ve kod okunabilirliğini sağlamak bir hayli zormuş (o dönemleri ben de göremedim :) ).

Bu karmaşıklığı önlemek için, benzer özellikte işleve sahip kod blokları, bir namespace altında toplanmış ve kullanılmak istenilen sınıfa ait namespace kod sayfasına eklendikten sonra kullanılabilir hale gelmiştir.

Örneğin uygulamızda bir liste kullanmak istediğimizde .net ile beraber gelen “System.Collections.Generic” namespace’i içerisinde yer alan standart List türünü kullanabiliriz. Eğer istersek de kendi namespace’imiz altında, kendi “List” sınıfımızı yazıp kullanmak istediğimiz kod sayfasında oluşturduğumuz “List”’in dahil olduğu isim alanını ekleyerek kullanabiliriz. Böylelikle aynı isimde, farklı namespace’lerde değişken ve sınıf tanımlamaları yapabilmekteyiz.

## 2-Namespace oluşturmak
Bir namespace’in yapısı aşağıdaki gibidir.
```c#

namespace namespace_ismi
{
// isim alanı içerisinde yer alacak sınıflar ve kod tanımlamaları bu alanda olacak.
}
```
## 3-Namespace kullanmak
Bir namespace’e ait özelliği kullanmak istediğimizde iki farklı yöntemle bunu yapabiliriz.

Bu yöntemlerden ilki önce oluşturduğumuz yeni isim alanının ismini yazdıktan sonra “.” İle içerisindeki tanımlamalara ulaşabiliriz.
```c#

namespace_ismi.YeniSinifIsmi;
```
## GİF
<img src ="https://github.com/FMSSBilisimAndroid/hasan-ak/blob/master/screen-record.gif" width = 300 height = 500/> 
