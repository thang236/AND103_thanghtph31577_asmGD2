package com.example.and103_thanghtph31577_assignment;

import com.example.and103_thanghtph31577_assignment.models.Address;
import com.example.and103_thanghtph31577_assignment.models.Product;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Product> generateDummyData() {
        List<Product> dummyData = new ArrayList<>();

        // Thêm dữ liệu giả vào danh sách dummyData
//        dummyData.add(new Product("1", "Táo", "Ngon ngọt.", "$50", "https://newfreshfoods.com.vn/datafiles/3/2018-02-27/16100958548622_hoaqua_1-500x500.jpg"));
//        dummyData.add(new Product("2", "Xoài", "Giòn chua.", "$40", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAMAAzAMBIgACEQEDEQH/xAAcAAADAQEBAQEBAAAAAAAAAAAFBgcEAwIIAQD/xAA/EAACAQMDAgMGAwcCBgEFAAABAgMEBREAEiEGMRNBUQcUImFxgTJCkRUjUqGxwdHh8BYkM0Ni8ZI0U3Ki4v/EABkBAAMBAQEAAAAAAAAAAAAAAAIDBAEABf/EACwRAAICAgICAgIBAgcBAAAAAAECAAMRIRIxBEETIlFhcSPwMkKBkaGx0VP/2gAMAwEAAhEDEQA/AB+5VGDDx8v/AFpmsdjiEa1tyjKoBuSJznPzOufTtp8dRXVgIiBzGmBlj6/TTH+7nJim/A3GC2M6lRAo5NF33kngsVOourfCmFPSnwxgjdj+mk2O71GN08zSMOdx9cf66cuofZ9HVGSa3s0TsS2zeSh+3lqb3C1XO0TNHXQSIo43jlT9/wDOpXc2HBM86ylwc5m3pCm9+6sgWYblVmlIbzwOP5419D26JUpkAUZx3189dO1Qob9R1edo3+FJ9G4z+uNfQtDOslGrrjtjjQpu/f41KvHIIM6y1cacMVyeBnWCqmjeNvFRcY5yPLSl1z46ulRTlwwUgYJHPfX70JXVF/oFkqEdUikKsHPLEd+dDbeTlSv6j8TlW+z+1X2tNbUU7RKRj4Wx4mfXGmejp6qy06wwoJYEGF8mA7ffWyurYKONmJCqo5JPYaECrq7udlFMyQf/AHV8/ppDEVgcmORNwJue7JJGc5VfPPcand8uSR9Y2uuQsDHMEcAcbW4OfvjTqek8qQ1XMWPdi3J0AuPTc9umWq+KZU/ECc51jX2r9nWdG2O51ExK0qDaODI3AP00E6nsz3dYWq5I5PAlWZVC9yPLXGj6gTZzhYx5+mNG7cgu6JKf/pmwQB+f/TQsSQN5M7GZxtvUSrHtippp2HG2NeB99erp1a9Nb55Ft1Qs0aFljYZ3Y9MaOLTwUybVCIM49M59NcbhQRVlOyMgOQTweR6H+en8r61x+JuNSH2br6+V3WVBLWVkgpXnETUy4CbWOMEfIkfpq7QVkciLz5aiN36eFD1jR1UcTmBH3yrGPzLyD9+NPlJfYCQpEkTeW8YA+WnL5VZAbPcBc7i37b4EampZ1xlZcA+nB0g2OXdCyMex00+1q7JJHSUobcS+84Py/wBdBelemrzXqZqen2ROOGcfz0sMPhLE+ziTWqW6haA+82hqV3JeLBXPmPL9O2g9PNPTVO6J5EdOzqcMuNOsXRd4gw5eItt2kc8g6A3mw3K3o5lpgR3DRnkaX86kjeIlqXxnEaenep4LzF+z7oEE7DbuPwrL/g6GdRWN7Y5eAM1Kx4OSSnyOkanqA3IPxKecDB1QOkep0rY/2VeDvJG1JH/7g8gfnq9LOX1fuFR5DVHBi8vrtJOfIa6eJIO0bHRLqK2T2ms3Im6mfmN8n/4nnQwVMgzgJ9mbQsuDPaRwy5Eo9zroqGm3nCqoIjQduOw+mhvRtSLqJqqc72D7c+hx5frpN6xuzVrvJEzCGM7Y19R6/fRD2T3NYqiptzE5b40J8/I/213lWch+p4tJ+25T2cwnb3B7axXC301fGUqE3K3dSO+tRyDuxyNKV+65t9ouYpp45ZF/PImPhP00DFWHEy2ZL/7OqGqgL25mo5u4Kcr910X6cv8ALQW/3K6hmq4RsdY/iLH1H117t3Vdtu1I8luqBJIDtVCCDuPbg6O2axQU0YlkG+ZviZmHJOo35hwlZ2Pz6ghd6gOuq3uEJQ2yo25yr5Awfprt05XUtugkgnRoZDkneMZJOdOMcEZGNoHHprHXWakrUKyRqeO/poz41/IODnEZiT/rS6CooBDA/M8oVufLn/f3069L0SUtrhRV5C86QerenZ7YyVMRMlKsgLLjlBnv9NUmxsGoVIPB50uj73At+5w7mh50jnWNzy2vc0SSpjGc6VermK3GN1k8N1jyHz2OdEOjOoIuorW1QnEkMrQygfxKccfI6rSwMzVkammTfr2gkobtTUUAIguFQqN/45PxfqM6rtthSCjjWNeFUBftpL9qMaxU9JW4XNPVxvn5bhn+WnG3VKVFDHIhGCoA50mvijhD6zMBi11XVzTXeko4yQkTrI2PNieP0Gm2I74gxzyBz66BLZpZr/NWz48HYojOec4/96NVUiU1IxyF2r31ychzd+oUn98r4KG/yB8EMvAPfPy0SpIkrqdt1vZlccF/hx886zWGzC83qa9VS7ot3h0yMOwHdv108rBHDHzgYGp6qC6fgQF3kyZV3s+WS5x3KodpVjUKISchee403WWWGlj8NBhe2NG1McgypBXyI0ndYy11sjdrRSe8VE7YRS21UP8AEfl/XTE/pupJyOt+ppUAajNNc4o/xsoHnk68k0tyiKEIQw/XXz/fLP1nWs1TXiaXz2xS8KPQKDp+9lnv8PTyGuMnEzbFkzuC5886vYI69gzPUXfaR06LPXispF2xSHDY8j5aCW8JWwbhlZozkFe+qb7UjDL03M743DGPrnUs6ab/AJhifNcE/PSK+iPwcSO5ADKZ05Xx3u3NbLo26cLw/wDGvr9RpVuVHPba2SlmUgoeDuxuHkdc4KialqElgYrIhyraotuqqG80iVUkMRfG1g+MqR3H8/56rQhxg9w6bzXqSy9eDUUTvTA5Qcrrj0LcBQ9Q0k0h2oSUYntzozZ+jrncohPMfdomGcFcsR8xra/s0WIDwq6TxSeFKg8+momtTiQYqutyM4lOZlni3LznnU0606Skr+oKKZARTTPiUj8owc/rjVBsViucFuhhrKsMwGNwTkgdtbqjp9pFANS5wc8eR0I+bhlV3LuxF6mtNLbYKWKniRVWRThRjGneFf3a49NJ93tl1pEMtMyzqpDGMjBOPIaO2O6x1tGhDYYcFD3X5HQeKQtxB9zRqe7rcKmgceFCrqR5nnOslu6ohnqkpaqI08shwhJyrH6623OM1MWE4deRnz0j3R1SRA6FZFkBAx89NussqfR1Cj/daNKyjeJgCGUjkaEdJT+HG1HI372Jtpz544Gi8c26Ibu5UaQrlXT0fVyNQRtNvXEkaDJY54wPXQ+Rp1tXuCe4b9oNvnqba8tE4WcKQrHsM6weyuga3W2oQLhC4575PmdN8BmrKYGalaPcPwyYGvUVItJH4cXhwp5KNM+C0vzXo7mnEUfaLLHOkVGzKCW3YJ9NB+nr41tQUk0haOM4Q58tEL/0A18vkNyqbu2YeFh2jbjPPz51mvfs7qJonNE0Uj4yqM5U50q3wrDvOCd/xAOfUaE6stYhy84Deh0tXzqN71Ux26g37ZXVZJF/KmecfPGh/TPTFZQUqx9QI5de4l5GfTPY6JPLQ2WtFOFijM3xxAYBOO40uyq3H3OoJ5HRj1aqWKmpooolCqihQNBOq7kyP7rHIUGMtjz0Qo69WjGG/n20jdXtXT3dKa3RNJNMQoOPhQH8xPoNb5DFqlRPcaNCNnRU8k9vmLgbY5iifTA/vr96hdUeBpSAMnk/Q6I2SjittpgpIzlI1wT6nuSfvk6nvtIr5au40tqpCzO+XYKe/kB/XXW18a1X+9TswvDeLbU1BpkqYmk/hBGugMdHICkimOTuN3Y+uNYOluhY0KVNaN0nBAxwuneOz0kahfBQgeZGuWuyz7IP9YMjntHvImgSgjfcN+5seg7aUrJIsbSqTgnBX56+hq/p+gqYzHLTowx+ZRqX3n2fJBc39ycoPxKueF+mmqxqHFx37k9lbE5i770ufibB+eu8dUUGFkI58joffbHX21maVMxn8yjQiKswuHyCNNUEjIk3BhLzebrBZLe9ZOGMaAsFUZJ0S6RkW50MNz8MoJkDRo55VTz+usFfRxXGkaJ8NleM+npoj0eBTW8W98BoAFAz5DsRpIwXVT1PRHc6XnqOO2PsWJnPbI7ayWvrOkqpxBKDFITxuPfXbqWxNXQs1KVEp5wx41P63pe4OxRo5AQeMLnnyI1ll19V2+oUrjOk6g91Ok/qJJrbK9xoe4OZEH5h56I9NiuhtKR3J99Snwl9uC4HYn5693QLNSSKwJ+EnjTPI42159iZONpvcFxgDRuAx/KeCDrTPBBMyvIuWHY+mp5CY1y6yhSvdg2nPpahqJacV9ymc0/eKM8b/mfl6aKovbhdGYDiGYKZ50LSNsi9WPJ0OuV8s3TsDyoYYi/43b8Uh/qdLvXnXDUiyUtr2STpw/mI/TPqdTatu61o8asUzT7eS53Fz88/01YSlelGTHV0lz9tRwvPtRnk3G3QyOm4rlztA+w0FHVd8mqImqauCnp5eSyIGIHz0tyGWeIlF8OEuBtVQBn++uVwhSB0ieNwV4YHjOex0PyM2o/4VWMsHVF/kklWmqROIwWGYxyB54GiNv8AaVX00cbzrFIjd1jJUg/Tkeuh/R9vZrvEJQY4p6RmDHsx7Yz+v6aXylbWTyU7KZvdFMaBEGURT54+vfQC1+Z31GmuviNblo6f9oNrvGIJnCSsP+nL8JP9job197P06lRLhZavwqyFf3cTt8DefH8J+eo/SU/vvKnaVzg7sHjnT30J1xV0U60dwkknpFXiYgs0aj+I+Y1QtgY/aR2UgbWE+mbtXUdGtHfYWp6lPhbeORj10zQXCEIzLMhGBk50QvlqpOpLcKimKCpCbo5Achh6H5HUEus9fFf5aNIZ192cpNGcjaf9NQ2eK6vrruJzgSv3Hq6GCBkhPiSYwFHbOuHQNpesr6m91+6Wepb4N3aNQOANIlNXxeFtkXY4HYjVc6VxDbIQOF2DUyKXsHI/z/EwHMZCUgj3N8Krper+rqKnmMMJMjjyGvHWVdLFbDHTOBLJ8KE9snjSJa7NUGriVZnkmduWIz9T+mnX+XwbikOVqjb3iljm5HiqGAb5jOlfrmrprTTpX1BKxowDkeQOm6njEMKJnCooAyfQaQvaHRm/+HbEcpB4itO3/iOcffTbgvFQe8zp5rIIq+jZWAcMvGoxf7caG6TQhTtPxLx5HVuVVpoMKPhUYAGpD1hWGovsxhb4EAQY+WkrlbcD8Sa44Ajr0z1sjRx09yISTsJPJtNtNUzVdSlTb3UCNMZ8n+WlKzdB08cAkuTbyPxZGFH+dOVmtU8KNHRgQ0zfgyoz+mpLTkhFziFULMfaFae/wyN4NSPCmA+JW/3zrS1TFIAUZcaCVvStJPL49Ruln7b2PI0KuFir4QzW+uljIHAY5GqRZei4ZciO3GqSeJO7qMd+dKPVfUYgo5Y6AGSY8ZzwNCIHrnqhHc3b4eGXccN89HayG3Ja3kIRQFPfy0i29mH6m7xA/Rdhp71VRuy5gQb5Tn8XoP10X9pfVf7Jo1o6FlWpnBWID/toPzY/kNbehLelh6MSpmJjmrN1VKT5KeVH2XH66k12u8l1vFwqak+EJyIEMoyETOMj017KKKkGB3NqXJmlqe43GxxyW+iUnDF5WkA3BeC3fPfS89PABE1LVe8Suu6UCMjw2Plz3+utdPVPSh4Y2kkQgr8L8EHuO/nxrNLVyxzRhY44gjAlc/i+41PWCpKgT0HPIZJhOmqUFIEnPhjad3mSfTHz1guDLcZXnp6RaWNcA4dn7euRozabdRXGWWWKd3O7cafGw5+uP5jRKtt8cNrq02SUaYLnE2Q5x550g+Qq2Y9ygeOTVyxFp/fvdQqXFo1KY2ZIz5cZ1ytc8tG5NPUSJ4wILg/vDxz9teaqaoqYFOyaKNFPBXkY+f8Ab+uj3SFuE5qa1Gd4qeHamVAUk88evGdOdwiF2igORCRYSD/nZRN4Y8OMkMjYX69/nr1TXCpoIZ1pWVEqkMUhK5IU+npo7V2qkpb9NS1BQ+9Rhopy2FgPmee+l+7ZimNPA0bqjf8AVRwyuPsONGjizcS9fE4MoHsq6snpKhLVcHIjY/uGYds+X0P9dOfXdjp5Iv2vFGMgATkDuvkfnjUKqLhmqgnpg0aRBcBm3Hjv6HX0N0ncIeqOllEuGWaIxTD54wT/AH1Rj5E4tI7EwciTCqhpJhtZo2b0B5099JXBJaFYCw3x8EZ9NS6ydL1Nqvdd76GPu0zxRgn8QBPxH6jGmKiRkrXaOVo38tedcPjfI9RZlButt/aixKJfCZGyDjIOiNltEFvXevxSnu5/xpRpr5WU64kMMxA7btp/TnXeS9X2pQrSUgiQjHiSNwP0Gl/JUG5FdzQxjVdrrFTqIlYNMxwqg9zpVqhJT1AqZMkP/wBU66Wa2hZzV11V49QeMjgJ9BrZ1EsVTRPRQn95KpXIPYHudBbzZfkY79TCTEHq3rCOCF6agYNMRjPkvz1O4nEikyvls9z5+eqdT+zi3ynYzTnjOd3n9dCq72V1QqD7rW4i8g8eT+oOnJZWmeWQT+pOyMe5UFAmq4qZvwg7j89MCgQxgADGl3xAlRBUj8IO1vv20yRlZIVYHg+utp3Y49+v4lQgaovUHjvCiySMn4hGhbH6a80dfS1wb3eZHxwV8wfnoN1LZa33ppqJ3FPJ/wBWKI7ST6nHcaH2dIqGYFF2N5jGNA3k2I/EiaAYZv8AaVq4WmhG2dB8OB31PIUrb1VijlYxQmQRlM8k5xqtGQPAWOB8JY6mVBTVJ9oNNJBKPdGq0JjK+hHY/bWFE+UZ9wWjt7SqpaHpepjhPhjaIV9B5cakENOaz3lpw0oRCxZV/D5ZH3x+uqX7YJGiscBUlc1Kg8dxn56Qao1dLY66lVTHHEQ8pdRkEnhc+mMHXo3k8gJRSuoCgkltdXLDWjw1X8YBG7nvx/vz1mcUe9mg8UKPiUPg5HPbHn21+QQr7xmR0AAOW778f+9FDE0dtaugip5EDhQqtuf6gDy+egcgbEor3qY6WKolnjNKsrSBCxMJwUGM9/LtotYruXrIKW7GWQKS2ZzwqgcMfIjOfXXKhtVZXL4+RAwBG/cec9wAO+vdFbTXXqWaYxohXMTSOTvCDBI+XB/XSn+KwFSdiPVLK2DejGm8VLvTRe4U0dfSSfjAZdoHOefrrxaFp6DperFEFRJpJX2iQOqkKBgEceWuc0Es1pqoKWOKJJ8SJIQArb8ZBHcHJ/noZ0ntFsutm8beYkMoQ87XzgqB3x2z8868+mn5KyoPR/vMvvt4sCR6gSS4yXG2wU8sRlqo3GU2E7lHHJHbudZqOhikilLYSTgCNM4Oc/6awxloy8kZZJEch1X4Sp8x9Nbqb3mZo2heWYIB8JA/D54H316hXgDxnnAlz9pzujtVStLUJBStGioERcbh6gapvsNrB/ztvVwyAiRT/UaVpaD9r0EXhjbKBtB9T9dEPY4Houq66kl/6kYdGx2JU4Oi8a3kf4ivJrCqcRn9oUlPbby8s0ioJohJknufwn+mlPpmCp6jubVUJKUERK7gOZT8vkPX1Omz2t2WC6VtE8qgskUi+YHcHWnomiiobFTRRD8Kgan8jjzI/M8+EKW201KoAQbvXGmO2iF4wuBjzGNTjqWtvK3N6enqfdafGUaNQWceZyePtrPbrlfLe6stwefkDEuNKF1NWsTdyp1dtgnX8OG8mA50nXCWksjSzXOqSLnHiStgEeWNOFpq6mpoKeWqhMUzr8aHy0i+2OkSfpuRtheRGDLtXJBzorEr5K6icw1OdB1lY6qpENLc4vELYAbK7j8s8aaYa1SnfOvl9AJn8OMF5CfwoMk/bVz6IhuUPTVIlzVhUAHhzlgufhB+eMaqccBmAuTFGx9Z1yFaargapDD8gyT9RqnWC+SijR6lJBG3ZjkkfXQ+09PUFrp9kECDjk4yfufPRK04a3xbFXkZOvLwTaCn1gIrL2YaWsp6hQ0citnWWR4w5yw+50rVFtuVfdX9wqDS0sYwWQAlz58H9NFD06PCHiVE8jY5LOefsNNF9jaAzHAmcr9eo4qZqemYPNJ8K4/L89LUUyUVwt8rsB4dRGSxP/kM6PP03GoLwttc+Z50j9aWa5ytFSbsQSt8co8h6aBeTOC+iYJJj37XaJqmwNsQMVlXIxnPOo9cookggEcsxeVGM0bZC7w2FCnzAGdXi6Rm+9KIwOXnpxnH8YHP/wCw1Aq2SVpB4sZDIWVhkgBs9/l2GvZcZYER1XRMzlHkXLKNsbbVZfMY/wD5/loz05SRrUCpkeOOQhkJBxjkZyexzofBAKqMQnlwcq/njWh43radrXHC7VBRsOz7dxDBs9++Ay/QnSLf6gKZxKqjwIfGZv6luLS0jU9GkqxA7GZYztKeZz21noIYaOpg+GpqKmQI0aBhgdvhyeMZPb0OsFBXSURCU0ibXUqYnG9Dx5j1++ublINxlllSfGd6Nwqny4xt+nbSUqCpxA1K7LeTh27jlUw0VPUS0jV8r1VedxQPkI3B/wAfYaD22SG2tV10gi/aGwDwkwd2e7c/0+euCTC0OwmaKrrljJp5I2DDa3kfUg9h5aH9MVETSVEdVDFJUvl1knb4VwPTtz/LGsStkQ7zOtdXOpnBhjuCiQne8p8XemCD37HzOTx9NEn93FfAYFxC35SMMoPnuHfz1jRKCS6U89U4CMj744ifIcfEfXt8tablPBFb4oIFYVD8eISGBweNuANvBOfXTnGRqKDcTgxierpYKJiEan2sNpVuV0T9kFPHN1LV1US7VEWOFxxn/TQq29KrUUK1NwkeTIzgngHGqF7LrfJTW2eaVt67zFC+AMqvGf10Hi1cTkRXkWHjuAfaz1PSW3qClo5g2/3USEqvADMf8a6dH3hHh8F2G1viQ47jy0M6z6UHV/U9VXGVo41IiVgO6rxx9Tk/fRWl6MSlpo4oqqUbVHPGf6aV5Lq7Bq+55xMZJ1hnTZKiOp55GdaLTbaKGbelPGreRC40uLQ3ikAEVSkygYAYYP66FXHqm92l/Da28H8M3ifCT9hpYff2Xc3nKnU1UFLHmRgMDzOlGquYqriodWCMMIzeul3p28196u/hXUIVlH7tUzhT/fThfLciWqRoQomUblOOx0Fju/3PQmZyJxjijZwVVQSO+iUcMMagMUyedTO73Xqigj8RIYnQfmTJ2/bSZXdRXupqWkluM6nttQ7QB9NUJYzDQEW1oXuUvrPquLp2mDCIz1L5CRg4APqx8hrj7Or/AFPUNHLBJGsc6SEyNGpCAHnjnW7qbpKi6hUtUF45QMK6+Wtvs+6dTp6jmpVl8VjIXL7cZ9M6VcFKAHvMMDcb6SmjhiCBQMDQ+9Xijtyu07qu3jGdEqyYU9FJLz8Kk8anBtU/UVeHnVzADnJ4BOhtt+ECtBGxms90W6wtPTL+6Dbcn1+WuXUlMstvkJ/EvxDRaht0dvpVhjQIo50C6proqamd5JAikYG7XMGWrLdwDPz2f3J5op7TVrtyPEgOe/qP76Q/aXZv2Vc5atYyYKlw7OB+BvPI+ffRahuHu0scsbgSRkMGHrp4nS39Z2KQEAkjZNHjlG9f7jVvjWCxAhP2EKuzgZFZLpHSUMNJbjGodw7Pgna3ybOR2+eh9zqo3nAWeKV4nBLxrj6488a1dSdO1vT9YKeZZGQsfBnC4VwM9/nz20PhElDCJkCO7cbSMgroviCfzLq35HE3XCdqmNTUECWOMRwAADGexHrrlHQolNMlVVSRUrLg5flsc8Dz1wjWn3PNMVZgNyRKTkd+5PC69323e7vTolQs8rA+I8eSARxxny+esX8Q2AGoPeY1Lo0UQgeNAGwc7z689tZKsruzIv4fh+HAzpqPTdKFoylR7tMARUZIY7s9u+OOdbJanpu1rEKGFa2pY4MjIHO7GCfUfQeusF6A/UZm/AxGTqKVDTKlXDNJl0QqWGRwM4x/MapTWK1zTRTSP4Xh4JTHf/Gle5zvJaDWVfuKziULB4K/H6nP/j2x8xrjZqq41leFgharqZCUMDZ28j8WQeMaxv6hBi9L2Y/S1f7Sq4rNaTmWb8wHEa+ZP01RZBDZrPHSU+FwvhRj+/8AfQHovpqm6WtktdXSJ7yybp5i2Ao9AT5aCv1Il46gjkR9tNgpCO3HrjyzoyRRVrsyW+zkcCMcCrGAqqANeai4UtO22aZVb0PfXWIqUBz37alvtH6Kuz3CW8WiWeeKb4pYFkbdEfVR5r8vLS0B6ziJlRpKymq3CRSozemdbaizU9dTPHURhlYYx6akHs//AGjGm6pkkSZW4SbOePrqz9P1prKIM/deDoQQ5NbTu4n2+0U1nqy0SkSIeCzZOPvozcrjHNDHCrjcxyR540v+1G9mxeFPAgklmJQDOO3OoxW3avrqs1UlVIJM/D4bEBR8tIqpd8j1/wBwC4E+goKNawlNmQdC7r7O7VW1ZmeNkYjnw3Kg/PS57Jera2quQtVxbxtyExSnvkeR1XyqHuAdUtSrb6P6nAB+4h0PVVrq0DR1cYPmrNgj7HnRC23uha5rDHVRF5BjaHHlqFyqA24jvol07b5Lhe6T3dmjP4mdOCMdz/bUzoSuS3Unr8lmM+jFZJVAbBBHY+ev0GGJSFCjHp5aW6M1irtimOFH/c51ziqKivD759jKcEBdAPJbA+u5ZyHuE7xeKaigZ3kUnso8ydLK2KW8zCsucZcA5WJvwr9vXX7b7E0vUAqKqoefw1yischSfPGnWREp4B8PAGABrEDXvlzgCD3FyO2U8ChREoxx217giNDUGoowFkxhl8m+ulvrnqSejiNLb2xVzcRqO+P4j6DR/o+hrB09TNcZTLUlAzu3cnTkK5yo/wDZmIRrILZ1LTPTzqhnx8UMg5+o/wAjU16i6HuVqaokoF94ikbcEP4oz6j17DTl1FQhamlmjZopFc7ZEOCPvrXTX6qhhCVsa1cXbcCA2qBerkrZr9xtV7VnUg5eakmdK9ZDI4+IyLtwe/b66MrbqGpg9+WtRGwWIZThiPLI++qrPdOirnUPSVNZSRTqcNDUYXBP/wCXB+2vX/AVhnw9OY9jdmjfgj7HTXqLgFTHJ5CyASCRneV4mYgkZB+2fvrfQS1Fvq4qiGlO7HDBfiyfr31bY/ZxYom3skYJ7knv/PRWksdjtnxpHGGA4IXnRcPziEfJXGBI5aOhbxfpzLJCaOORu8inn5garPTvS9o6SojM+1XI+OWQ5Zj6f6a2U1+pKiFv2SqFMlS/oR30u3dqn39JaiR51YhQh7KT2wNLsuSkZxmTPaW6i77Vrrdb3Sx0trEqU3iDMSfikPln5fLQO2010pbfE09DM1QvJK47/rqoUFhDr49QAzkf/H5a2UdLSyPJEjRlom2uFb8J9D6ansay3vEWdxb6T6jir092qN0FVEBvhlGGHz+mnilgSQA9xnjnj66AX/pOGrp/FhUxzxjMc0Zwyn66EWS7XGFPdpakSSp/GMZHrpK3GluLD/SZkg4Me5LRQysGkpYmOc5KjXXbBSUx2BY41B4HGgUNxr5lCr4II+ulOv6hukd3ZLnSgUatgPCS3HqRpjeQv+VdwiwE3dSWij6kQrXRl1zlGDYZfodKsXsnp5HHhXCqAJ/hU4/lp+tVfba6HfBURv64YaN09RSRKDuUDRVWIB/imfU9wB0l0Hbem5PeIhJLVFdpmlOTj5DsNMzzLGdoYffQK9dYW22Rt4k6mT8qIdzH7am966zuktczxQyRIQCFc4OO+dc93/zGYD2okTKv8GNO3smp0kkrZ2/LtQfLOTpSrYGQFChDqcHPfI0e9md0SguslJMcJUY2k/xDQ2bQyKggMMytN+6gYnyHOdIMV3vadSzLSW2Wakdvik/CAfqe41QXZXRgrDkYIOsgMcEeFUbvMDgHSyVbGehPRIzO/Tm+SaWSVdr5AIz241s6i94e2SrRsgmOAC+cD9NY7JUYqplYgE/Fj7aNFQ5Ge3fRULmogH3OEnvT3R0grHrK+d6qeVt0krrjPoAPIaoccSQQ88KBr2u2P0GdK3U/UCpIlDTOpnlIRR6k6ZwWgc2O5xMD9VV09zu0FutcZkkGXkf8sajgZ+pzj6aIW3o95lVrjO7E9wGIGNH+nrPFQUmSoMjnc7Hux9TopUVEVNG0sjqir3LHA0qvxvkX5LNZnYA7ivVdC2iaNkaFTkEfEM/10uXaKbpeBY0j3U4OF2jGBqg0lfT1yM9LMHVTgkeugHtAiH7EqZAMsq5H10NqCtedcx11EaCuuvUF6o4qKDFNE++Yu3H01Q4rNVSxBZpwg8gg7az9B2sUdmikdB4so3FvPRe+XUW2Dgb5GPAOiVRwNthwJyDIiaOhXslfLcbPUyqzsWmhdspL9vI65x3iE3ylparhjJgo3fONUGgnSsoklGPiHOp97QLatNWU9xiQK8bYyB/v/Z1luVAYHIM5hKOqIYV2gduNSSw101D7Qb7TyEhlqS+D+ZGOQf0/pqk9L1y1triYtlgBnS91n0fLXV8d7s5WO5xLtZWOFmX0J/vqmwfJUCveJscifFpwfUE6mfVamgr/AHiI7Qkisflk4OqTSApSIHzkKAc6SrqkVRfhCwVo9p3Bhntn/TUnmfY1n8zm6m+iYSJG2eHGd2uE0aPVyqwBXjg6/paymt8DPJIscca7tx/CB89J/S/UhvnU1QYVPgsSqj1A7HWH7MCNgdziBDHUXRcNzt5npP3NamfDlUkH6HHcal9FcJ6K4PS3VpXiLFHWVyTGfXX0dDCBSqvqNQ72s2oUd4jqkUL7wh3gfxD/AEP8tUqorcL6P/ETauswvaPDQgRRohPd1HOex5/nrRcaOGpmWSpy77MAk+WTpY6YuTGijyNxjYBs+Y7E/pg/bTOtrrLpmohBWLO1MnHA1Wq50JLrozz1lY94e40q5OMzIB3/APL/ADpBaPtIvwupyCPLVu3Q1MC1EDB4ZRkE+npqddXdOtbZWraJSaNzllH/AGm/x/TtrL68fYRTqQf3MFH1ReoYDGtUHZBkeIuSR9RrhP1tep1KGqCZH/bjGh0f7uQfz0Oqo/BqJF+41IqId4hpYx9ysezW2V1ZRyXSorZvGqCNpc7htGfLTZdrrU2Oimqa9oBBEuS4Y5/oNfnQGwdN0fh/h8JdCfaTZ7hf4aW3UKkRM++aTOOB2GhStSOecZlwBAnGy9Xf8T0viUtQacqdrI4+Ieny1sorJBFdIKuRhNOXxvY5OuHTnTNNZKLwFjTeR+8OM51ueKCiljmBKbGH5jz9tIsrZQzAa/cKOTSCKEueyrnUer71W9RdTNBISKOAkiPOAe4zj01W2xPTbR2dNJND0c63d6lhtRs7vi7/AEGn+U5YBUHcJhnqMfSsAioXYDHiPkfTWbrqQfspoiRmR1RR65Oj8YSmgVV/AoxqY9ddQJJeKOCJsx086yTfP5aGwcKRUe5rdSkWuLwKKKMflQZ1M/axX1RhqYqViskZGCD357aplunWWlR15UjjHp5aXeoeklvN3hqHlWOmPM6juxHbGisGUQrvEz1qEuiPE/4ZomnH7x41LfprD1xEKmjMR7nkfLHOmWGJKWmSKJdqIoAA8tLN1dq2adR2EbRj6ka3yFHxrX+Zxil0B1PHEro4fwfEIRiONUmG500qA+IvPPfUmslGtLRU9L4eJUZY3HzBwdVhaGBabEkSkAea6VQWywQ6E4ama6XmnpITtkBc9lBzqfpcRUXiSOZpY5G53LgZ+XOtdPeaFur6yzrEniRKpR+/J5K/oRo69igrVZ/DKyDs40L1PYOZ7gtufkVgpq6jaCeFZopB8Qk+LcNarH0baLNUNUUFKsMjD8pOP0zpKoOup+n7vU2i9xsyxN8FRGM5XyJH+NOdJ1ra549yVUTLjP4wCP17aej1ouHGP+pwdc7MYwAi4J+mo57YJ0kq6OEHLtvJHy0813V1J4MjU0omIBO1PiJ1L0t1w60vr1cuYaZGAyfyr5AfPXKTbYAOhF3WLxxO3s8sXv8AGamVXWKOQjg8ODj4R/Pn56fa6/2uzSrRybtyqDtjXIX5a5VdTS9M2tIoUXxMbYo1xyfXSFM8s0ryyuzSOdzEgcnXoEisY9waKOeSYwdPXCW2StFKkjU0h+JcdvmOdNsqQywgqVkp5V48wQfXU+eLBxsPPy0UsN5ktz+BKHelY8ofyH1Ghrs/ytKPIo5fZYH6q6YltrtWUSl6PPxAcmL/AE+elWuj8enWZAd6cNjzGriPDqIRLEyzQOPqPodJHUPSfgs9Xao9yMD4lOBkr81/xobKsfZZ5fEqdTV7Lep4kphaKxtkkefCP8Q9PtqnmogKfE4zjXzrS7IKnax9QWPfRu2V9Yrmkqaucx/hOXJOD89SjmG+kor8jWDKtdrrb6OJ5J6iNEUfEzOMDUh6y6ya8bqOyhxD+ebkF8fw+g+ehFypXgqpIJyXKnG5ucjyOhlG/u9V2BAP8tEFyct6/wBpov5T6F6Z/akNmpGcmqIiXepIDdu48jrbUdRUVI6w1O+KZ8lY3XDN64B760dNTJNZ6Zo8FTGCCPPjU/8AbHTVkD0VzpMkwNnj+egCMtYZGlIY4zHOaorLpCxp8RI3Yn8R/wAaWouix7000g3MTn4v66y9E9X+8Um6SN8rw42nK/6aaX6ppXX/AJeN5H9EUnUiW1jPzf4hOByNz3TeJZY1WQ5p/MHun+miy3KlZA6zJgjP4tIdPef+IL9Pa2zG9NhpEPz5H9dN0lkg9xcGNdxHfaNNqa3ZQYH7mgn1BF36yoGr4bRRVSPWTtsXYchTg98a/rSJg5p6392x53Hs3z1N6vpmqoOpaSqtyAoKlWIPBjOcn6jVulpYKmkHjRq3w5HHbRiv5DzU5MxSc7mCKy21asVhjTxBz34J9de7pcv3MsVF+9n2njOADjzOpjcOrha+uZrZWTkW7aoBJxsc+p9NVK2vRTwI1Mse0r+XXKWzxOgf+YeZCulae4L7Q1S6xSQVrys7h/MnnIPmOfLX0BTwiGDHn565S2+klnhneCNpYiTG2OVz6HXWeQQwO5OVxnVeQuSZgXEhntRWOPq5GTA3xAP+pGstl2soRsbWGDnWTrmtFx6kqpouVU7E+3fTV070zLUzRyy5ipggJx3c+g0upWIUiefbtsz96VpKmaqZUTCRZDuRx/702saLpy2ZCqqd1TsZH/3+mv6srqCw0al9q4/6cS92/wB+uka53H9qVLT1J3fwqGG1R8hqoYqGPcdR45c5PUz3SsqLhWPU1Mibm7KGGFHoNZQvz3fPI128OFsExIR5ZGtsUUOwfuwPoNIZsnJnqAYGBP/Z"));
//        dummyData.add(new Product("3", "Chuối", "Ngon to.", "$60", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVpq8KXeexcSnnjbwJEyjk6oX1a1IZoHOHvg&usqp=CAU"));
        // Thêm các loại cây khác nếu cần
        return dummyData;
    }

    public static List<Address> getAddress() {
        List<Address> dummyData = new ArrayList<>();

        // Thêm dữ liệu giả vào danh sách dummyData
        dummyData.add(new Address("1", "John Doe", "123 Main St"));
        dummyData.add(new Address("2", "Jane Doe", "456 Elm St"));
        dummyData.add(new Address("3", "John Smith", "789 Oak St"));

        return dummyData;
    }
}
